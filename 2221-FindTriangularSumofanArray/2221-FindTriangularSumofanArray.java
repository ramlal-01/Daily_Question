// Last updated: 8/1/2026, 1:21:29 pm
1class Solution {
2    public int triangularSum(int[] nums) {
3        int n =nums.length;
4        while (n>1) {
5            for (int i =0;i<n- 1;i++) {
6                nums[i]=(nums[i]+nums[i+1])%10;
7            }
8            n--; 
9        }
10        return nums[0];
11    }
12}
13