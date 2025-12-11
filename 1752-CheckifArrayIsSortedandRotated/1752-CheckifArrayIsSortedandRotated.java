// Last updated: 11/12/2025, 7:41:37 pm
1class Solution {
2    public boolean check(int[] nums) {
3        int n = nums.length ;
4        int c = 0 ;
5        for( int i =0 ; i<n ; i++){
6            if( nums[i] > nums[(i+1)%n] ) c++;
7            if( c>1 ) return false ;
8        }
9        return true ;
10    }
11}