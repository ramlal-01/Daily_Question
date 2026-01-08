// Last updated: 8/1/2026, 1:46:47 pm
1class Solution {
2    public int maxDotProduct(int[] nums1, int[] nums2) {
3        int n = nums1.length, m = nums2.length;
4        int[][] dp = new int[n][m];
5        for(int i = 0; i < n; i++){
6            Arrays.fill(dp[i],Integer.MIN_VALUE);
7        }
8        dp[n-1][m-1] = nums1[n-1] * nums2[m-1];
9        for(int i = n-2; i>= 0; i--){
10            dp[i][m-1] = Math.max(dp[i+1][m-1],nums1[i] * nums2[m-1]);
11        }
12        for(int i = m-2; i>= 0; i--){
13            dp[n-1][i] = Math.max(dp[n-1][i+1],nums1[n-1] * nums2[i]);
14        }
15        for(int i = n-2; i>= 0; i--){
16            for(int j = m-2; j>= 0; j--){
17                dp[i][j] = Math.max(Math.max(nums1[i]*nums2[j],nums1[i]*nums2[j]+dp[i+1][j+1]), Math.max(dp[i+1][j],dp[i][j+1]));
18            }
19        }
20        return dp[0][0];
21    }
22}