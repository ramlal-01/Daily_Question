// Last updated: 18/7/2026, 11:00:25 pm
1class Solution {
2public:
3    vector<vector<int>> threeSum(vector<int>& nums) {
4
5        vector<vector<int>> res;
6        int n = nums.size();
7
8        sort(nums.begin(), nums.end());
9
10        for (int i = 0; i < n - 2; i++) {
11
12            if (i > 0 && nums[i] == nums[i - 1])
13                continue;
14
15            int j = i + 1;
16            int k = n - 1;
17
18            while (j < k) {
19                int sum = nums[i] + nums[j] + nums[k];
20                if (sum == 0) {
21                    res.push_back({nums[i], nums[j], nums[k]});
22                    j++;
23                    k--;
24                    while (j < k && nums[j] == nums[j - 1])
25                        j++;
26
27                    while (j < k && nums[k] == nums[k + 1])
28                        k--;
29                }
30                else if (sum < 0) {
31                    j++;
32                }
33                else {
34                    k--;
35                }
36            }
37        }
38
39        return res;
40    }
41};