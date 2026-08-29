// Last updated: 29/8/2026, 10:42:55 pm
1class Solution {
2    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
3        int n = nums.length;
4
5        int[][] pairs = new int[n][2];
6
7        for (int i = 0; i < n; i++) {
8            pairs[i][0] = nums[i];
9            pairs[i][1] = i;
10        }
11
12        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
13
14        int start = 0;
15
16        while (start < n) {
17            int end = start;
18
19            while (end + 1 < n && (long) pairs[end + 1][0] - pairs[end][0] <= limit) {
20                end++;
21            }
22
23            int size = end - start + 1;
24            int[] indices = new int[size];
25
26            for (int i = 0; i < size; i++) {
27                indices[i] = pairs[start + i][1];
28            }
29
30            Arrays.sort(indices);
31
32            for (int i = 0; i < size; i++) {
33                nums[indices[i]] = pairs[start + i][0];
34            }
35
36            start = end + 1;
37        }
38
39        return nums;
40    }
41}