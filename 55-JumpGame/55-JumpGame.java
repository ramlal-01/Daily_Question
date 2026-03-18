// Last updated: 18/3/2026, 3:56:14 pm
1class Solution {
2    public boolean canJump(int[] nums) {
3        int n = nums.length ;
4        if( nums.length == 1 ) return true ;
5        int max = 0 ;
6        for( int i=0 ; i<n ; i++ ){
7            if( i> max ) return false ;
8
9            max  = Math.max( max , i+nums[i]);
10            if( max >= n-1) return true ;
11        }
12        return false ;
13    }
14}  