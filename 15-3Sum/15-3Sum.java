// Last updated: 3/3/2026, 9:25:36 pm
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        Arrays.sort(nums);
5        int n = nums.length;
6
7        for (int k = 0; k < n - 2; k++) {
8            if (k > 0 && nums[k] == nums[k - 1]) continue;  
9
10            int i = k + 1, j = n - 1;
11
12            while (i < j) {
13                int sum = nums[k] + nums[i] + nums[j];
14
15                if (sum == 0) {
16                    res.add(Arrays.asList(nums[k], nums[i], nums[j]));
17                    i++;
18                    j--;
19
20                    while (i < j && nums[i] == nums[i - 1]) i++; 
21                    while (i < j && nums[j] == nums[j + 1]) j--;
22                } else if (sum < 0) {
23                    i++;
24                } else {
25                    j--;
26                }
27            }
28        }
29        return res;
30    }
31}
32