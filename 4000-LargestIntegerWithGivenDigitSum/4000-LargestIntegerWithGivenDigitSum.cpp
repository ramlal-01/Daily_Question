// Last updated: 28/7/2026, 12:05:07 am
1class Solution {
2public:
3    int largestInteger(int n, int s) {
4
5        if (s > 9 * n)
6            return -1;
7
8        string res = "";
9
10        for (int i = 0; i < n; i++) {
11            if (s >= 9) {
12                res += '9';
13                s -= 9;
14            }
15            else {
16                res += to_string(s);
17                s = 0;
18            }
19        }
20
21        return stoi(res);
22    }
23};