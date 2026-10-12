// Last updated: 12/10/2026, 4:31:25 pm
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
12    public ListNode oddEvenList(ListNode head) {
13        if( head==null || head.next==null) return head;
14        ListNode first = head;
15        ListNode sec = head.next; 
16        ListNode sechead= head.next;
17        while(sec!=null && sec.next!=null){
18            first.next = first.next.next;
19            first = first.next;
20            sec.next = sec.next.next;
21            sec = sec.next;
22        }
23        first.next = sechead;
24
25        return head;
26    }
27}