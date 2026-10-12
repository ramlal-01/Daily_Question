// Last updated: 12/10/2026, 2:42:02 pm
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int i = 0 ;
4        int j = 0 ;
5        int zeroes =  0 ;
6        int max = 0 ;
7        while( j<nums.length){
8            if( nums[j]==0) zeroes++;
9
10            if( zeroes>k ){
11                if( nums[i]==0){
12                    zeroes--;
13                }
14                i++;
15            }
16            max = Math.max( max , j-i+1);
17            j++;
18        }
19        return max;
20    }
21}