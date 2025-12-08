// Last updated: 8/12/2025, 8:36:47 am
1class Solution {
2    public int countTriples(int n) {
3        int count = 0;
4
5        for (int a = 1; a <= n; a++) {
6            for (int b = 1; b <= n; b++) {
7                int c2 = a * a + b * b;
8                int c = (int)Math.sqrt(c2);
9                if (c <= n && c * c == c2) {
10                    count++;
11                }
12            }
13        }
14
15        return count;
16    }
17}
18