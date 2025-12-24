Node mergeKLists(Node[] arr) {
        Queue<Node> q = new LinkedList<>();
        for(Node n : arr){
            q.add(n);
        }
        while(q.size() > 1){
            Node a = q.remove();
            Node b = q.remove();
            Node c = merge(a,b);
            q.add(c);
        }
        return q.peek();
    }
