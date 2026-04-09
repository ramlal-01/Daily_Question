// Last updated: 9/4/2026, 3:30:45 pm
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeKLists(ListNode[] lists) {
13
14        PriorityQueue<ListNode> pq = new PriorityQueue<>( (a,b)-> a.val - b.val ) ;
15
16        for( ListNode curr : lists ){
17            if( curr!=null ){
18                pq.add( curr) ;
19            }
20        }
21
22        ListNode dummy = new ListNode(0) ;
23
24        ListNode node = dummy ;
25        
26        while( !pq.isEmpty() ){
27            ListNode curr = pq.poll() ;
28
29            // System.out.println( curr.val ) ;
30
31            ListNode nnode = new ListNode(curr.val ) ;
32
33            dummy.next = nnode ;
34            dummy = dummy.next  ;
35
36            if( curr.next!=null ){
37                pq.add( curr.next ) ;
38            }
39
40        }
41
42        return node.next ;
43    }
44}