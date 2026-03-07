// Last updated: 7/3/2026, 1:37:52 pm
1class Solution {
2    public int minFlips(String s) {
3
4        int n = s.length();
5        s = s + s;
6
7        int c = 0; 
8        int cnt = 0;  
9        int ans = Integer.MAX_VALUE;
10
11        for (int i = 0; i < s.length(); i++) {
12
13            int bit = s.charAt(i) - '0';
14
15            if (bit != (i % 2)) c++;
16
17            if (bit != (1 - i % 2)) cnt++;
18
19            if (i >= n) {
20                int prev = s.charAt(i - n) - '0';
21
22                if (prev != ((i - n) % 2)) c--;
23                if (prev != (1 - (i - n) % 2)) cnt--;
24            }
25            
26            if (i >= n - 1) {
27                ans = Math.min(ans, Math.min(c, cnt));
28            }
29        }
30
31        return ans;
32    }
33}