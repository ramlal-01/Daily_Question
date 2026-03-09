// Last updated: 9/3/2026, 10:46:26 pm
1class Solution {
2
3    public int numberOfStableArrays(int zero, int one, int limit) {
4        int MOD = 1000000007; 
5        long[][][] dp = new long[zero + 1][one + 1][2]; 
6        for(int i = 1; i <= Math.min(zero, limit); i++) {
7            dp[i][0][0] = 1;
8        } 
9        for(int j = 1; j <= Math.min(one, limit); j++) {
10            dp[0][j][1] = 1;
11        }
12        for(int z = 1; z <= zero; z++) {
13            for(int o = 1; o <= one; o++) { 
14                dp[z][o][0] = (dp[z-1][o][0] + dp[z-1][o][1]) % MOD;
15
16                if(z - limit - 1 >= 0) {
17                    dp[z][o][0] = (dp[z][o][0] - dp[z-limit-1][o][1] + MOD) % MOD;
18                } 
19                dp[z][o][1] = (dp[z][o-1][0] + dp[z][o-1][1]) % MOD;
20
21                if(o - limit - 1 >= 0) {
22                    dp[z][o][1] = (dp[z][o][1] - dp[z][o-limit-1][0] + MOD) % MOD;
23                }
24            }
25        }
26        return (int)((dp[zero][one][0] + dp[zero][one][1]) % MOD);
27    }
28}