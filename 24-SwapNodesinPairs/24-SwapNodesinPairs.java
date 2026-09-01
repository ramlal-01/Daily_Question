// Last updated: 2/9/2026, 12:34:49 am
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
12    public ListNode swapPairs(ListNode head) {
13        int k=2;
14        int n = k;
15        ListNode dummy = new ListNode(-1);
16        dummy.next = head;
17        ListNode start =dummy.next;
18        ListNode end = dummy.next; 
19        ListNode prev = dummy;
20        ListNode temp = dummy.next; 
21        while(temp!=null){
22            ListNode check = start;
23            int count =0 ;
24            while( check!=null && count<k){
25                check = check.next;
26                count++;
27            } 
28            if( count==k){
29                while( k>1 ){
30                end = end.next;
31                k--;
32                }
33                ListNode newstart = reverse( start, end, end.next);
34                prev.next= newstart;
35                prev = start;
36                end = start.next;
37                start = start.next;
38            }
39            else{
40                break;
41            }
42            k=n;
43            temp = start;
44        }
45        
46        return dummy.next;
47    }
48    public ListNode reverse( ListNode curr, ListNode end , ListNode prev){
49        if( curr== end.next){
50            return prev;
51        }
52
53        ListNode temp = reverse( curr.next , end , curr);
54        curr.next = prev;
55        return temp;
56    }
57}