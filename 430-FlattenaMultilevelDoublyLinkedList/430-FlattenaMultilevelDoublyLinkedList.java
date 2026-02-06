// Last updated: 6/2/2026, 11:51:24 am
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
27            
28
29            if( temp.next == null && !st.isEmpty() ) {
30                Node curr = st.pop() ;
31                temp.next = curr ;
32                curr.prev = temp ;
33            }
34
35            temp =  temp.next ;
36        }
37        return head ;
38    }
39}