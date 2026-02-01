// Last updated: 1/2/2026, 8:57:44 am
1class Solution {
2    public int finalElement(int[] nums) {
3        int n = nums.length ; 
4        
5        return Math.max( nums[0] , nums[n-1]);
6    }
7}