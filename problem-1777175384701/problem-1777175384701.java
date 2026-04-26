// Last updated: 26/4/2026, 9:19:44 am
1class Solution {
2    public long minOperations(int[] nums) {
3        int n = nums.length ;
4        long max = 0 ;
5        
6        for( int i =1 ; i<n ; i++ ){
7            if( nums[i] < nums[i-1] ){
8                max +=  nums[i-1]-nums[i]  ;
9                
10            }
11        }
12        return max ;
13    }
14}