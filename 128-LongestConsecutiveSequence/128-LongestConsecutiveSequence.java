// Last updated: 9/3/2026, 4:02:08 pm
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        int n = nums.length;
4        if(n == 0) return 0;
5        Arrays.sort(nums);
6        int cnt = 1 ;
7        int ans = 1 ;
8        for( int i=0 ; i<n-1 ; i++ ){
9            if( nums[i+1]==nums[i])continue ;
10            if( nums[i+1]==nums[i]+1){
11                cnt++;
12                ans = Math.max( ans , cnt );
13            }
14            else cnt = 1 ;
15        }
16        return ans ;
17    }
18}