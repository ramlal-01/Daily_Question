// Last updated: 29/11/2025, 7:56:58 pm
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int sum =0 ;
4        for( int ele : nums){
5            sum+= ele ;
6        }
7        return sum%k ;
8    }
9}