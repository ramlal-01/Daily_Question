// Last updated: 12/10/2026, 11:45:30 am
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length ;
4        int pre[] = new int[n];
5        int post[]= new int[n];
6        
7        pre[0] = 1 ;
8        post[n-1] = 1 ;
9
10        for( int i = 1 ; i<n ; i++ ){
11            pre[i] = pre[i-1] * nums[i-1] ;
12        }
13
14        for( int i = n-2 ; i>=0 ; i-- ){
15            post[i] = post[i+1]*nums[i+1] ;
16        }
17
18        for( int i = 0 ; i<n ; i++ ){
19            nums[i] = pre[i] * post[i] ;
20        }
21        return nums ;
22    }
23}