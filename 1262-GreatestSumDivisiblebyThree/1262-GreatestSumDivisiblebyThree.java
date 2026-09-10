// Last updated: 10/9/2026, 1:38:27 pm
1class Solution {
2    public int maxSumDivThree(int[] nums) {
3        int n = nums.length;
4        int[][] dp = new int[n + 1][3];
5
6        // Initialize
7        dp[0][0] = 0;
8        dp[0][1] = Integer.MIN_VALUE;
9        dp[0][2] = Integer.MIN_VALUE;
10
11        for (int i = 1; i <= n; i++) {
12            int x = nums[i - 1];
13            int mod = x % 3;
14
15            for (int r = 0; r < 3; r++) {
16                // Case 1: Do NOT take x
17                int notTake = dp[i - 1][r];
18
19                // Case 2: Take x
20                int prevR = (r - mod + 3) % 3;
21                int take = dp[i - 1][prevR];
22                if (take != Integer.MIN_VALUE) {
23                    take += x;
24                }
25
26                dp[i][r] = Math.max(notTake, take);
27            }
28        }
29
30        return dp[n][0];
31    }
32}
33