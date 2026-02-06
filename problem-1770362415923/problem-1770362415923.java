// Last updated: 6/2/2026, 12:50:15 pm
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        ListNode temp = head ;
14        int cnt = 0 ;
15        while( temp!=null ){
16            temp = temp.next ;
17            cnt++;
18        }
19        int arr[] = new int[cnt ];
20        temp = head ;
21        int p = 0 ;
22        while( temp!=null ){
23            arr[p++] = temp.val;
24            temp = temp.next ;
25        }
26
27        for( int i =0 ; i+k-1<cnt ; i+=k ){
28            reverse( arr , i , i+k-1);
29        }
30
31        temp = head ;
32        for( int i=0 ;i<cnt ; i++ ){
33            temp.val = arr[i] ;
34            temp = temp.next ;
35        }
36
37        return head ;
38    }
39    public void reverse( int arr[] , int left, int right ){
40        while( left<=right ){
41            int temp = arr[right];
42            arr[right] = arr[left] ;
43            arr[left] = temp;
44            left++;
45            right--;
46        }
47    }
48}