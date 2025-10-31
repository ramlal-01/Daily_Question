// Last updated: 31/10/2025, 3:20:49 pm
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
    public ListNode reverseList(ListNode head) {

        if( head == null ) return head ;

        return helper( head , null );
    }

    public ListNode helper( ListNode curr , ListNode prev ){
        if( curr == null ){
            return prev;
        }

        ListNode temp =  helper( curr.next , curr );
        curr.next = prev ;

        return temp;
    }
}