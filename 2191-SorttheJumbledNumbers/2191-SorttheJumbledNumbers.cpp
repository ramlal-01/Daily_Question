// Last updated: 20/7/2026, 9:05:38 am
1class Solution {
2public:
3    vector<int> sortJumbled(vector<int>& mapping, vector<int>& nums) {
4        vector<pair<int,int>> temp ;
5
6        for (int ele : nums) {
7            int ori = ele;
8            int no = 0;
9
10            string s = to_string(ele);
11
12            for (char c : s) {
13                no = no * 10 + mapping[c - '0'];
14            }
15            temp.push_back({no, ori});
16        }
17
18        stable_sort(temp.begin(), temp.end(),
19            [](const pair<int,int>& a, const pair<int,int>& b) {
20                return a.first < b.first;
21            });
22
23        vector<int> res ;
24
25        for( auto &ele : temp ){
26            res.push_back( ele.second ) ;
27        }
28        return res ;
29    }
30};