// Last updated: 22/9/2026, 10:29:19 pm
1class Solution {
2    public long[] resultArray(int[] nums, int k) {
3        long[] result = new long[k];
4        long[] state = new long[k];
5        for (int value : nums) {
6            int rem = value % k;
7            long[] nextState = new long[k];
8            for (int r = 0; r < k; r++) {
9                int newRem = (r * rem) % k;
10                nextState[newRem] += state[r];
11                result[newRem] += state[r];
12            }
13            nextState[rem]++;
14            result[rem]++;
15            state = nextState;
16        }
17        return result;
18    }
19}