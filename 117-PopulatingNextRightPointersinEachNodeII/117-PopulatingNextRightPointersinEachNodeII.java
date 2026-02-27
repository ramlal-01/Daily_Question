// Last updated: 28/2/2026, 1:17:41 am
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23
24 
25class Solution {
26    public Node connect(Node root) {
27        
28        if (root == null) return null;
29        Queue<Node> q = new LinkedList<>();
30        q.add(root);
31
32        while(!q.isEmpty()){
33            int size = q.size();
34
35            for( int i = 0 ; i<size ; i++){
36                Node n = q.poll();
37
38                if( n.left!=null) q.add(n.left);
39                if( n.right!=null) q.add(n.right);
40
41                if (i < size - 1) {
42                    n.next = q.peek();  
43                }
44            }
45        }
46        return root;
47    }
48}