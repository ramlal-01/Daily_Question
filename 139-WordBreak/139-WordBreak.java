// Last updated: 27/3/2026, 11:00:58 pm
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        int n = s.length();
4        boolean dp[] = new boolean[n+1] ;
5        dp[0] = true ;
6        for (int i = 1; i <= n; i++) {
7            for (int j = 0; j < i; j++) {
8                if (dp[j] && wordDict.contains(s.substring(j, i))) {
9                    dp[i] = true;
10                    break;
11                }
12            }
13        }
14        return dp[n];
15    }
16}