// Last updated: 21/1/2026, 2:46:23 pm
1class Solution {
2    public int minLength(String s) {
3        StringBuilder sb = new StringBuilder();
4
5        for (char ch : s.toCharArray()) {
6            sb.append(ch);
7
8            int len = sb.length();
9            if (len >= 2) {
10                char a = sb.charAt(len - 2);
11                char b = sb.charAt(len - 1);
12
13                if ((a == 'A' && b == 'B') || (a == 'C' && b == 'D')) {
14                    sb.delete(len - 2, len);
15                }
16            }
17        }
18        return sb.length();
19    }
20}
21