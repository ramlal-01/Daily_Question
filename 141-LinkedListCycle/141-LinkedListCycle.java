// Last updated: 9/4/2026, 3:31:39 pm
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
29            dummy.next = curr  ;
30            
31            dummy = dummy.next  ;
32
33            if( curr.next!=null ){
34                pq.add( curr.next ) ;
35            }
36
37        }
38
39        return node.next ;
40    }
41}