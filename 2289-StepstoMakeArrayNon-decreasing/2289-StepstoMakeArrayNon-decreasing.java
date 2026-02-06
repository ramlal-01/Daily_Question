// Last updated: 6/2/2026, 2:49:53 pm
1class Solution {
2    public int totalSteps(int[] nums) {
3        int n = nums.length ;
4        int dp[] = new int[n] ;
5
6        Stack<Integer> st = new Stack<>() ;
7        int ans = 0 ;
8        for( int i = n-1 ; i>=0 ; i-- ){
9            int cnt = 0 ;
10            while( !st.isEmpty() && nums[st.peek()]< nums[i] ){
11                cnt = Math.max( cnt+1 , dp[st.peek()] );
12                st.pop();
13            }
14
15            dp[i] = cnt ;
16            ans = Math.max( ans , cnt ) ;
17            st.push(i);
18        }
19
20        return ans ;
21    }
22}
23