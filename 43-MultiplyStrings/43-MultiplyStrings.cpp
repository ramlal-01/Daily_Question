// Last updated: 2/8/2026, 11:59:51 pm
1class Solution {
2public:
3    string multiply(string num1, string num2) {
4        int n = num1.size();
5        int m = num2.size();
6
7        vector<int> arr(n + m, 0);
8
9        for (int i = m - 1; i >= 0; i--) {
10            int x = num2[i] - '0';
11            int carry = 0;
12
13            for (int j = n - 1; j >= 0; j--) {
14                int y = num1[j] - '0';
15
16                int sum = arr[i + j + 1] + x * y + carry;
17                arr[i + j + 1] = sum % 10;
18                carry = sum / 10;
19            }
20
21            arr[i] += carry;
22        }
23
24        int i = 0;
25        while (i < n + m && arr[i] == 0)
26            i++;
27
28        if (i == n + m)
29            return "0";
30
31        string res;
32        while (i < n + m)
33            res += arr[i++] + '0';
34
35        return res;
36    }
37};