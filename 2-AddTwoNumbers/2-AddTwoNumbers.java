// Last updated: 23/9/2026, 10:24:21 pm
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummynode = new ListNode(-1);
14        ListNode curr= dummynode; 
15        ListNode t1 = l1;
16        ListNode t2 = l2;
17        int carry =0;
18        while( t1!=null || t2!=null){
19            int sum = carry;
20            if(t1!=null) sum += t1.val ;  
21            if(t2!=null) sum += t2.val ; 
22            ListNode n = new ListNode(sum%10);
23            carry = sum/10;
24            curr.next = n;
25            curr = curr.next;
26
27            if(t1!=null) t1=t1.next;
28            if(t2!=null) t2=t2.next;  
29        }
30        if(carry>0){
31            ListNode n = new ListNode(carry);
32            curr.next = n;
33        }
34        return dummynode.next;
35    }
36     
37}