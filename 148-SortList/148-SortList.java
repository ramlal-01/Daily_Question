// Last updated: 6/2/2026, 12:25:26 pm
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
12    public ListNode merge( ListNode left , ListNode right ){
13        ListNode dummy = new ListNode(0) ;
14        ListNode temp = dummy ;
15        while( left!=null && right!=null ){
16            if( left.val <= right.val ){
17                dummy.next = left ;
18                dummy = dummy.next ;
19                left = left.next;
20            }
21            else {
22                dummy.next = right ;
23                dummy = dummy.next ;
24                right= right.next ;
25            }
26        }
27
28        dummy.next = left==null ? right : left ;
29        return temp.next ;
30    }
31    public ListNode sortList(ListNode head) {
32        if (head == null || head.next == null) return head;
33
34        ListNode prev = middle( head ) ;
35        ListNode mid = prev.next ;
36        prev.next = null ;
37
38        ListNode left = sortList(head);
39        ListNode right = sortList(mid) ;
40       head = merge( left , right ) ;
41
42        return head ;
43
44    }
45
46    public ListNode middle( ListNode head ){
47        ListNode slow = head ;
48        ListNode fast = head ;
49        ListNode prev = null ;
50
51        while( fast!=null && fast.next!=null ){
52            prev = slow ;
53            slow = slow.next ;
54            fast = fast.next.next ;
55        }
56        return prev ;
57    }
58}