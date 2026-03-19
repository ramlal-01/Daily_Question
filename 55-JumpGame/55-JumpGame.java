// Last updated: 19/3/2026, 8:11:31 pm
1class Solution {
2    public boolean canJump(int[] nums) {
3        int n = nums.length ;
4
5        int max = 0 ;
6
7        for( int i = 0 ; i<n ; i++ ){
8            if( i>max ) return false ;
9
10            max = Math.max( max , i+nums[i] );
11
12            if( max>= n-1 ) return true ;
13        }
14
15        return false ;
16    }
17}