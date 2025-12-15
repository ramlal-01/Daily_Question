// Last updated: 15/12/2025, 9:09:51 am
1class Solution {
2    public int numSub(String s) {
3        int MOD = (int)1e9 + 7;
4        long one = 0;
5        long ans = 0;
6
7        for (char c : s.toCharArray()) {
8            if (c == '1') {
9                one++;
10            } else {
11                ans = (ans + (one * (one + 1)) / 2) % MOD;
12                one = 0;
13            }
14        }
15        
16        ans = (ans + (one * (one + 1)) / 2) % MOD;
17
18        return (int) ans;
19    }
20}
21