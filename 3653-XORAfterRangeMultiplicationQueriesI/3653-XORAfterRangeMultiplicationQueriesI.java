// Last updated: 8/4/2026, 7:58:32 am
1class Solution {
2    public int xorAfterQueries(int[] nums, int[][] queries) {
3        int n = nums.length ; 
4        int MOD = (int)1e9 + 7;
5        for( int ele[] : queries ){
6            int l = ele[0] ;
7            int r = ele[1] ;
8            int k = ele[2] ;
9            int v = ele[3] ;
10
11            int idx = l ; 
12
13            while( idx<=r ){
14                nums[idx] = (int)((nums[idx] * 1L * v) % MOD);
15                idx+= k ;
16            }
17        }
18
19        int ans = 0 ;
20
21        for( int ele : nums ){
22            ans^= ele ;
23        }
24
25        return ans ;
26    }
27}