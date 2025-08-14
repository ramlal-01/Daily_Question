// Last updated: 14/8/2025, 4:27:56 pm
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode temp1 = list1;
        for( int i=0; i<b; i++){
            temp1 = temp1.next;
        }

        for( int i=0; i<a-1; i++){
            temp = temp.next;
        }
        temp.next = list2;

        
        ListNode temp2 = list2;
        while(temp2.next!= null){
            temp2= temp2.next;
        }
        temp2.next = temp1.next;
        return list1;
    }
}