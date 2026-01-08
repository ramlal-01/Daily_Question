// Last updated: 8/1/2026, 1:48:31 pm
1class Solution {
2    public boolean validPartition(int[] nums) {
3        int n = nums.length;
4        boolean[] dp = new boolean[n + 1];
5        dp[0] = true;
6
7        if(nums[1] == nums[0]) dp[2] = true;
8        for (int i = 2; i < n; i++) {
9
10            if (nums[i] == nums[i - 1]) dp[i+1] |= dp[i - 1];
11            
12            if (nums[i] == nums[i - 1] && nums[i] == nums[i - 2]) dp[i+1] |= dp[i - 2];
13            
14            if (nums[i] == nums[i - 1] + 1 && nums[i] == nums[i - 2] + 2) dp[i+1] |= dp[i-2];
15            
16        }
17
18        return dp[n];
19    }
20}