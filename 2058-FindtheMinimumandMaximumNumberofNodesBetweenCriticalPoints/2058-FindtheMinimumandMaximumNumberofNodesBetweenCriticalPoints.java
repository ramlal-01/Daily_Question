// Last updated: 1/9/2026, 12:45:28 am
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
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        if( head.next.next==null) {
14            return new int[]{-1,-1} ;
15        }
16
17        int prev = head.val  ;
18        head=head.next ;
19
20        int ind = 2 ;
21
22        List<Integer> list = new ArrayList<>() ;
23        while( head.next!=null ){
24            if( (head.val >prev && head.val>head.next.val)
25            ||  (head.val <prev && head.val<head.next.val) ){
26                list.add(ind) ;
27            }
28            ind++;
29            prev = head.val ;
30            head = head.next ;
31            
32        }
33        int n = list.size() ;
34
35        if(n<2 ) return new int[]{-1,-1} ;
36
37        int b = -1 ;
38        if( n >=2) b = list.get(n-1) - list.get(0) ;
39        else if( n==1 ) b = 1 ;
40
41        int a = Integer.MAX_VALUE ;
42
43        if( n<2 ) a = 1 ;
44        else{
45            for( int i = 0 ; i<list.size()-1 ; i++ ){
46                int x = list.get(i+1)-list.get(i) ;
47                a = Math.min(a,x) ;
48            }
49        }
50        
51        if( a==Integer.MAX_VALUE ) a= -1 ;
52        // System.out.println(list) ;
53        return new int[]{a,b} ;
54    }
55}