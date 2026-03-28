// Last updated: 28/3/2026, 8:05:38 pm
1class Solution {
2    public int minAbsoluteDifference(int[] nums) {
3        int mini = Integer.MAX_VALUE ;
4        int n  = nums.length ;
5        for( int i = 0 ; i<n ; i++ ){
6            for( int j = 0 ; j<n ; j++ ){
7                if( nums[i]==1 && nums[j]==2 ){
8                    mini = Math.min( mini , Math.abs(i-j));
9                }
10            }
11        }
12        if( mini == Integer.MAX_VALUE ) return -1 ;
13        return mini ;
14    }
15}