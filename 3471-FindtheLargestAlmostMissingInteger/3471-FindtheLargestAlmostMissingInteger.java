// Last updated: 18/8/2026, 10:49:52 am
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int n = nums.length;
4
5        if (n == 1) return nums[0];
6
7        if (n == k) {
8            return Arrays.stream(nums)
9                    .max()
10                    .orElseThrow();
11        }
12
13        if (k == 1) {
14            int ans = -1;
15
16            for (int i = 0; i < n; i++) {
17                int cnt = 0;
18
19                for (int j = 0; j < n; j++) {
20                    if (nums[i] == nums[j]) cnt++;
21                }
22
23                if (cnt == 1) {
24                    ans = Math.max(ans, nums[i]);
25                }
26            }
27
28            return ans;
29        }
30
31        int cnt = 0;
32
33        for (int i = 1; i < n; i++) {
34            if (nums[i] == nums[0]) cnt++;
35        }
36
37        int cnt1 = 0;
38
39        for (int i = n - 2; i >= 0; i--) {
40            if (nums[i] == nums[n - 1]) cnt1++;
41        }
42
43        if (cnt == 0 && cnt1 == 0)
44            return Math.max(nums[0], nums[n - 1]);
45
46        else if (cnt == 0 && cnt1 != 0)
47            return nums[0];
48
49        else if (cnt != 0 && cnt1 == 0)
50            return nums[n - 1];
51
52        else
53            return -1;
54    }
55}