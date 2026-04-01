// Last updated: 1/4/2026, 12:28:39 pm
1class Solution {
2    public String stringHash(String s, int k) {
3        int n = s.length();
4        StringBuilder sb = new StringBuilder();
5
6        for (int i = 0; i < n; i += k) {
7            int cnt = 0;
8
9            for (int j = i; j < i + k; j++) {
10                cnt += s.charAt(j) - 'a';
11            }
12
13            cnt = cnt % 26;
14
15            sb.append((char)(cnt + 'a'));
16        }
17
18        return sb.toString();
19    }
20}