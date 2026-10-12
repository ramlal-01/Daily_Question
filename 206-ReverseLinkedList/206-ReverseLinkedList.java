// Last updated: 12/10/2026, 4:42:12 pm
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
12    public ListNode reverseList(ListNode head) {
13        return reverse( head , null ) ;
14    }
15
16    public ListNode reverse( ListNode curr , ListNode prev ){
17        if( curr==null ){
18            return prev ;
19        }
20
21        ListNode temp = reverse( curr.next , curr ) ;
22        curr.next = prev ; 
23        return temp ;
24    }
25}