// Last updated: 31/10/2025, 3:50:54 pm
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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;

        while( fast!=null && fast.next!=null){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        return slow ;
    }
}