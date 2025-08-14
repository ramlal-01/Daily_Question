// Last updated: 14/8/2025, 4:25:52 pm
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
    public ListNode doubleIt(ListNode head) {
        int c = reverse(head,0 );
        if(c>0){
            ListNode dummy = new ListNode(c);
            dummy.next = head;
            return dummy;
        }
        return head;
        
    }

    public int reverse( ListNode curr,int carry){
        if(curr==null){
            return carry;
        }
        int car = reverse(curr.next,0); 
        int sum = curr.val*2;
        curr.val = (sum%10)+car ;
        car= sum/10;
        return car;
    }
}