// Last updated: 10/2/2026, 6:57:16 am
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5
6        for (int i = 0; i < n; i++) {
7            Map<Integer, Integer> odd = new HashMap<>();
8            Map<Integer, Integer> even = new HashMap<>();
9
10            for (int j = i; j < n; j++) {
11                if (nums[j] % 2 == 0) {
12                    even.put(nums[j], even.getOrDefault(nums[j], 0) + 1);
13                } else {
14                    odd.put(nums[j], odd.getOrDefault(nums[j], 0) + 1);
15                }
16
17                if (odd.size() == even.size()) {
18                    ans = Math.max(ans, j - i + 1);
19                }
20            }
21        }
22        return ans;
23    }
24}
25