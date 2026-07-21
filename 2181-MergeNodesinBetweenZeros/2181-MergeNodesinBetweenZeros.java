// Last updated: 21/7/2026, 9:23:54 pm
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
12    public ListNode mergeNodes(ListNode head) {
13        ListNode dummy = new ListNode(0) ;
14        ListNode node = dummy ;
15        head = head.next ;
16        int sum = 0 ;
17        while( head!=null ){
18            sum+=head.val ;
19
20            if( head.val == 0 ){
21                ListNode nnode = new ListNode(sum) ;
22                node.next = nnode ;
23                node = node.next ;
24                sum = 0 ;
25            }
26            head = head.next ;
27        }
28        return dummy.next ;
29    }
30}