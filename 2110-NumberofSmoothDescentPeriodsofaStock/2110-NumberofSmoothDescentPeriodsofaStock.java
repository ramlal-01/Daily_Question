// Last updated: 16/12/2025, 4:59:05 pm
1class Solution {
2    public long getDescentPeriods(int[] prices) {
3        int n = prices.length;
4        long res = 1; // total number of smooth descending periods, initial value is dp[0]
5        int prev = 1; // total number of smooth descending periods ending with the previous element, initial value is dp[0]
6        // traverse the array starting from 1, and update prev and the total res according to the recurrence relation
7        for (int i = 1; i < n; ++i) {
8            if (prices[i] == prices[i - 1] - 1) {
9                ++prev;
10            } else {
11                prev = 1;
12            }
13            res += prev;
14        }
15        return res;
16    }
17}