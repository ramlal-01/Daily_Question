// Last updated: 3/3/2026, 9:24:54 pm
1class Solution {
2    public char findKthBit(int n, int k) {
3        StringBuilder s = new StringBuilder("0");
4
5        for (int i = 2; i <= n; i++) {
6            StringBuilder inverted = new StringBuilder();
7
8            for (int j = 0; j < s.length(); j++) {
9                inverted.append(s.charAt(j) == '0' ? '1' : '0');
10            }
11
12            inverted.reverse();
13            s.append("1").append(inverted);
14        }
15
16        return s.charAt(k - 1);
17    }
18}