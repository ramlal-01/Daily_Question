// Last updated: 5/2/2026, 3:20:35 pm
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
12    int cnt = 0 ;
13    public int[] nextLargerNodes(ListNode head) {
14        
15        ListNode temp = reverse( head , null  );
16        int res[] = new int[cnt+1] ;
17
18        ArrayDeque<Integer> st = new ArrayDeque<>() ;
19        int k =cnt ;
20
21        while( temp!=null ){
22            while( !st.isEmpty() && st.peek()<=temp.val ){
23                st.pop() ;
24            }
25
26            if( st.isEmpty() ){
27                res[k--] = 0 ;
28            }
29            else res[k--] = st.peek() ;
30
31            st.push( temp.val ) ;
32
33            temp = temp.next ;
34        }
35        return res ;
36    }
37
38    public ListNode reverse( ListNode curr , ListNode prev  ){
39        if( curr.next==null ){
40            curr.next = prev ;
41            return curr ;
42        }
43        cnt++;
44        ListNode temp = reverse( curr.next , curr );
45        curr.next = prev ;
46        return temp ;
47    }
48}