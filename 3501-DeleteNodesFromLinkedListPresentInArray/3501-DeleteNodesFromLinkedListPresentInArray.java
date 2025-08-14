// Last updated: 14/8/2025, 4:25:23 pm
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> arr = new HashSet<>();
        for( int i=0; i<nums.length ; i++){
            arr.add(nums[i]);
        }

        while( head!=null && arr.contains(head.val)){
            head = head.next;
        }
        ListNode temp = head;
        while(temp.next!=null && temp!=null){ 
            if(arr.contains(temp.next.val) ){ 
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}