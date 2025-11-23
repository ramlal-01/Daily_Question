// Last updated: 24/11/2025, 1:22:27 am
class Solution {
    public int maxSumDivThree(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n + 1][3];

        // Initialize
        dp[0][0] = 0;
        dp[0][1] = Integer.MIN_VALUE;
        dp[0][2] = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int x = nums[i - 1];
            int mod = x % 3;

            for (int r = 0; r < 3; r++) {
                // Case 1: Do NOT take x
                int notTake = dp[i - 1][r];

                // Case 2: Take x
                int prevR = (r - mod + 3) % 3;
                int take = dp[i - 1][prevR];
                if (take != Integer.MIN_VALUE) {
                    take += x;
                }

                dp[i][r] = Math.max(notTake, take);
            }
        }

        return dp[n][0];
    }
}
