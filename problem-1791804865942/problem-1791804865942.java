// Last updated: 12/10/2026, 5:04:25 pm
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
12    public int pairSum(ListNode head) { 
13        ListNode slow = head, fast = head;
14        while (fast != null && fast.next != null) {
15            slow = slow.next;
16            fast = fast.next.next;
17        }
18 
19        ListNode secondHalfHead = reverse(slow, null);
20 
21        ListNode firstHalfHead = head;
22        int max = 0;
23        while (secondHalfHead != null) {
24            max = Math.max(max, firstHalfHead.val + secondHalfHead.val);
25            firstHalfHead = firstHalfHead.next;
26            secondHalfHead = secondHalfHead.next;
27        }
28        return max;
29    }
30 
31    public ListNode reverse(ListNode curr, ListNode prev) {
32        if (curr == null) 
33            return prev; 
34        ListNode newHead = reverse(curr.next, curr);
35        curr.next = prev;
36        return newHead;
37    }
38}
39