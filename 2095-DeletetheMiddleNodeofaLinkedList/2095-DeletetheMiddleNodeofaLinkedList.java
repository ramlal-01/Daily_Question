// Last updated: 12/10/2026, 4:24:26 pm
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
12    public ListNode deleteMiddle(ListNode head) {
13        if (head.next == null) {
14            return null;
15        }
16        
17        ListNode fast = head;
18        ListNode slow = new ListNode(0);
19        slow.next =head; 
20        while(fast!=null &&fast.next!=null){
21            slow = slow.next;
22            fast = fast.next.next;
23        } 
24        slow.next = slow.next.next;
25        return head;
26    }
27}