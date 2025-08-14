// Last updated: 14/8/2025, 4:27:01 pm
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        // Step 1: Find middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        ListNode secondHalfHead = reverse(slow, null);

        // Step 3: Find max pair sum
        ListNode firstHalfHead = head;
        int max = 0;
        while (secondHalfHead != null) {
            max = Math.max(max, firstHalfHead.val + secondHalfHead.val);
            firstHalfHead = firstHalfHead.next;
            secondHalfHead = secondHalfHead.next;
        }
        return max;
    }
 
    public ListNode reverse(ListNode curr, ListNode prev) {
        if (curr == null) 
            return prev; 
        ListNode newHead = reverse(curr.next, curr);
        curr.next = prev;
        return newHead;
    }
}
