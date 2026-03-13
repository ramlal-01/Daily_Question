// Last updated: 13/3/2026, 11:29:14 pm
1class Solution {
2    public long minNumberOfSeconds(int height, int[] times) {
3        long lo = 1, hi = 10000000000000000L;
4
5        while (lo < hi) {
6            long mid = (lo + hi) >> 1;
7            long tot = 0;
8            for (int i = 0; i < times.length && tot < height; i++)
9                tot += (long) (Math.sqrt((double) mid / times[i] * 2 + 0.25) - 0.5);
10            if (tot >= height)
11                hi = mid;
12            else
13                lo = mid + 1;
14        }
15
16        return lo;
17    }
18}