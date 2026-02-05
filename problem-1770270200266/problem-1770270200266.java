// Last updated: 5/2/2026, 11:13:20 am
1class Solution {
2    public ListNode doubleIt(ListNode head) {
3        ListNode node = new ListNode(0) ;
4        node.next = head ;
5
6        ListNode prev = node ;
7        ListNode curr = head ;
8
9        while( curr!=null ){
10            int val = curr.val*2 ;
11
12            if( val>=10 ){
13                prev.val+=1 ;
14                curr.val= val % 10 ;
15            }
16            else {
17                curr.val = val ;
18            }
19            prev= curr ;
20            curr = curr.next ;
21        }
22
23        return node.val==0 ? node.next : node ; 
24    }
25}
26