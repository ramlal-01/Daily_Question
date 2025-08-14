// Last updated: 14/8/2025, 4:25:49 pm
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        
        while (temp != null && temp.next != null) { 
            int data = gcd(temp.val, temp.next.val);
            
            ListNode nn = new ListNode(data); 
            nn.next = temp.next;
            temp.next = nn;
            
            temp = nn.next;  
        }
        return head;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
