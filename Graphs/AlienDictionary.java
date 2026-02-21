package Graphs;

import java.util.*;

public class AlienDictionary {
    public String findOrder(String[] words) {
        // abc acb c b  ->  "" (no valid ordering) cycle
        // ["baa", "abcd", "abc", "cab", "cad"] ans = ""
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<26;i++) adj.add(new ArrayList<>());
        int[] indegree = new int[26];
        for(int i=0;i<words.length-1;i++){
            String word1 = words[i];
            String word2 = words[i+1];
            if(word1.equals(word2)) continue; // abc abc
            if(word1.length() > word2.length() && word1.startsWith(word2)) return "";
            if(word2.length() > word1.length() && word2.startsWith(word1)) continue; // abc abcd
            int[] a = comparison(word1,word2);
            int u = a[0];
            int v = a[1];
            adj.get(u).add(v);
            indegree[v]++;
        }
        boolean[] flag = new boolean[26];
        for(int i=0;i<words.length;i++){ // check which letters are in the alien language
            String word = words[i];
            for(int j=0;j<word.length();j++){
                char ch = word.charAt(j);
                flag[ch-97] = true;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<26;i++){
            if(indegree[i]==0 && flag[i]) q.add(i);
        }
        String ans = "";
        while(q.size() > 0){
            int front = q.remove();
            char letter = (char)(front + 97);
            ans += letter;
            for(int ele : adj.get(front)){
                indegree[ele]--;
                if(indegree[ele]==0) q.add(ele);
            }
        }
        int alphabets = 0;
        for(int i=0;i<26;i++){
            if(flag[i]) alphabets++;
        }
        if(ans.length() != alphabets) return "";
        return ans;
    }

    private int[] comparison(String word1, String word2) { // abcd abc
        int[] a = {-1,-1};
        int i = 0;
        while(word1.charAt(i) == word2.charAt(i)) i++;
        a[0] = word1.charAt(i) - 97;
        a[1] = word2.charAt(i) - 97;
        return a;
    }
    // public String findOrder(String[] words) {
    //     // abc acb c b  ->  "" (no valid ordering) cycle
    //     // ["baa", "abcd", "abc", "cab", "cad"] ans = ""
    //     ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //     for(int i=0;i<26;i++) adj.add(new ArrayList<>());
    //     int[] indegree = new int[26];
    //     for(int i=0;i<words.length-1;i++){
    //         String word1 = words[i];
    //         String word2 = words[i+1];
    //         int[] a = comparison(word1,word2);
    //         int u = a[0];
    //         int v = a[1];
    //         if(u==-2) return "";
    //         if(u!=-1){
    //             adj.get(u).add(v);
    //             indegree[v]++;
    //         }
    //     }
    //     boolean[] flag = new boolean[26];
    //     for(int i=0;i<words.length;i++){ // check which letters are in the alien language
    //         String word = words[i];
    //         for(int j=0;j<word.length();j++){
    //             char ch = word.charAt(j);
    //             flag[ch-97] = true;
    //         }
    //     }
    //     Queue<Integer> q = new LinkedList<>();
    //     for(int i=0;i<26;i++){
    //         if(indegree[i]==0 && flag[i]) q.add(i);
    //     }
    //     String ans = "";
    //     while(q.size() > 0){
    //         int front = q.remove();
    //         char letter = (char)(front + 97);
    //         ans += letter;
    //         for(int ele : adj.get(front)){
    //             indegree[ele]--;
    //             if(indegree[ele]==0) q.add(ele);
    //         }
    //     }
    //     int alphabets = 0;
    //     for(int i=0;i<26;i++){
    //         if(flag[i]) alphabets++;
    //     }
    //     if(ans.length() != alphabets) return "";
    //     return ans;
    // }

    // private int[] comparison(String word1, String word2) { // abcd abc
    //     int[] a = {-1,-1};
    //     int i = 0, len = Math.min(word1.length(),word2.length());
    //     while(i<len && word1.charAt(i) == word2.charAt(i)) i++;
    //     if(i==len){
    //         if(word1.length() > word2.length()){ // gadbad
    //             a[0] = -2; // check
    //         }
    //         return a;
    //     }
    //     a[0] = word1.charAt(i) - 97;
    //     a[1] = word2.charAt(i) - 97;
    //     return a;
    // }
}
