// Last updated: 28/2/2026, 1:18:54 am
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) { 
13        Node temp = head ;
14
15        Stack<Node> st = new Stack<>() ;
16
17        while( temp!=null ){
18
19            if( temp.child!=null ) 
20            {
21                if( temp.next!=null ) st.push( temp.next ) ;
22
23                temp.child.prev = temp ;
24                temp.next = temp.child ;
25                temp.child = null ;
26            }
27            if( temp.next == null && !st.isEmpty() ) {
28                Node curr = st.pop() ;
29                temp.next = curr ;
30                curr.prev = temp ;
31            }
32            temp =  temp.next ;
33        }
34        return head ;
35    }
36}