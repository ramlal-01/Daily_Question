// Last updated: 25/2/2026, 8:34:59 pm
1class Solution {
2    public boolean canJump(int[] nums) {
3        int max = 0 ;
4        if( nums.length==1) return true; 
5        for( int i =0 ; i< nums.length-1 ; i++){
6            if( i > max ) return false ;
7            max = Math.max( max , i+ nums[i]);
8
9            if( max >= nums.length-1){
10                return true ;
11            }
12        } 
13        return false ;
14    }
15}