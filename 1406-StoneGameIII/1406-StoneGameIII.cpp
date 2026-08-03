// Last updated: 3/8/2026, 11:29:14 pm
1class Solution {
2public:
3    vector<int> dp;
4
5    string stoneGameIII(vector<int>& arr) {
6        int n = arr.size();
7
8        dp.assign(n, INT_MIN);
9
10        int res = helper(0, arr);
11
12        return res > 0 ? "Alice" : (res == 0 ? "Tie" : "Bob");
13    }
14
15    int helper(int ind, vector<int>& arr) {
16        if (ind >= arr.size())
17            return 0;
18
19        if (dp[ind] != INT_MIN)
20            return dp[ind];
21
22        int res = INT_MIN;
23
24        res = max(res, arr[ind] - helper(ind + 1, arr));
25
26        if (ind + 1 < arr.size())
27            res = max(res,
28                      arr[ind] + arr[ind + 1] - helper(ind + 2, arr));
29
30        if (ind + 2 < arr.size())
31            res = max(res,
32                      arr[ind] + arr[ind + 1] + arr[ind + 2] - helper(ind + 3, arr));
33
34        return dp[ind] = res;
35    }
36};