package Recursion;

import java.util.ArrayList;

public class ArrayOfStrings {
    public static void main(String[] args) {
        String[] arr = {"Sree","Yuvraj","Mayank","Nikul"};
        System.out.println(arr[2]);
        for(String ele : arr)
            System.out.print(ele+" ");
        ArrayList<String> list = new ArrayList<>();
        list.add("Nitish");
    }
}
