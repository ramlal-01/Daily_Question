// Last updated: 8/9/2026, 2:21:47 pm
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        int total = 0 ;
4
5        for( int ele : nums){
6            total += ele;
7        }
8
9        int s1  = target+total;
10        if( s1%2!=0 || s1<0) return 0 ;
11
12        s1 = ( target + total )/2 ;
13
14        return subsetsum( nums , s1 );
15
16    }
17
18    public int subsetsum( int[] nums , int target){
19        int dp[] = new int[target+1];
20
21        dp[0] = 1 ;
22
23        for( int i = 0 ; i<nums.length ; i++){
24            for( int j = target ; j>=nums[i] ; j-- ){
25                dp[j] = dp[j] + dp[ j-nums[i]];
26            }
27        }
28
29        return dp[target];
30    }
31}