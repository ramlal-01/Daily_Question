// Last updated: 5/5/2026, 10:21:21 am
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if( head==null) return null;
14        ListNode temp = head;
15        int n=1;
16        while( temp.next!=null){
17            temp = temp.next ;
18            n++;
19        } 
20        k = k%n;
21        temp.next = head;
22        ListNode temp2 = head;
23        int t =n-k;
24        while( t>1){
25            temp2= temp2.next;
26            t--;
27        }
28        head = temp2.next;
29        temp2.next = null;
30        return head;
31    }
32}