// Last updated: 3/2/2026, 8:24:37 am
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
12    public ListNode doubleIt(ListNode head) {
13        int c = reverse(head,0 );
14        if(c>0){
15            ListNode dummy = new ListNode(c);
16            dummy.next = head;
17            return dummy;
18        }
19        return head;
20        
21    }
22
23    public int reverse( ListNode curr,int carry){
24        if(curr==null){
25            return carry;
26        }
27        int car = reverse(curr.next,0); 
28        int sum = curr.val*2;
29        curr.val = (sum%10)+car ;
30        car= sum/10;
31        return car;
32    }
33}