// Last updated: 6/10/2026, 7:37:23 pm
1class Solution {
2public:
3    int minSwaps(string s) {
4        stack<int> open;
5        stack<int> close;
6
7        for (int i = 0; i < s.size(); i++) {
8            if (s[i] == '[') {
9                open.push(i);
10            } else {
11                if (!open.empty()) {
12                    open.pop();
13                } else {
14                    close.push(i);
15                }
16            }
17        }
18
19        int count = (close.size() + 1) / 2;
20
21        return count;
22    }
23};