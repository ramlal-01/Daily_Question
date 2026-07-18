// Last updated: 18/7/2026, 10:29:11 pm
1class Solution {
2public:
3    vector<int> twoSum(vector<int>& nums, int target) {
4        unordered_map<int, int> mp;
5
6        for (int i = 0; i < nums.size(); i++) {
7            if (mp.find(target - nums[i]) != mp.end()) {
8                return {mp[target - nums[i]], i};
9            }
10            mp[nums[i]] = i;
11        }
12
13        return {};
14    }
15};