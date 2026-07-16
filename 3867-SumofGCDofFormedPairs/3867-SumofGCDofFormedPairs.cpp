// Last updated: 16/7/2026, 11:19:38 pm
1class Solution {
2public:
3    vector<int> sequentialDigits(int low, int high) {
4        vector<int> ans;
5
6        int len1 = to_string(low).size();
7        int len2 = to_string(high).size();
8
9        for (int len = len1; len <= len2; len++) {
10
11            for (int start = 1; start <= 9; start++) {
12
13                string s = "";
14                int cur = start;
15
16                while (s.size() < len && cur <= 9) {
17                    s += to_string(cur);
18                    cur++;
19                }
20
21                if (s.size() != len)
22                    continue;
23
24                int num = stoi(s);
25
26                if (num >= low && num <= high)
27                    ans.push_back(num);
28            }
29        }
30
31        return ans;
32    }
33};