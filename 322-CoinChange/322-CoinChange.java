// Last updated: 26/3/2026, 10:41:09 am
1class Solution {
2    public int coinChange(int[] nums, int sum) {
3        int n = nums.length;
4        int INF = (int)1e9;
5
6        int[][] dp = new int[n + 1][sum + 1];
7
8        for (int j = 1; j <= sum; j++) {
9            dp[0][j] = INF;
10        }
11
12        for (int i = 1; i <= n; i++) {
13            for (int j = 0; j <= sum; j++) {
14                
15                dp[i][j] = dp[i - 1][j];
16
17                if (nums[i - 1] <= j) {
18                    dp[i][j] = Math.min(dp[i][j],
19                        1 + dp[i][j - nums[i - 1]]);
20                }
21            }
22        }
23
24        return dp[n][sum] >= INF ? -1 : dp[n][sum];
25    }
26}