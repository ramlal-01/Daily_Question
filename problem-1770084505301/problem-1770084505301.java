// Last updated: 3/2/2026, 7:38:25 am
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
16        ListNode fast = head;
17        ListNode slow = new ListNode(0);
18        slow.next =head; 
19        while(fast!=null &&fast.next!=null){
20            slow = slow.next;
21            fast = fast.next.next;
22        } 
23        slow.next = slow.next.next;
24        return head;
25    }
26}