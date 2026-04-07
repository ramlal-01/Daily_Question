// Last updated: 7/4/2026, 12:12:52 pm
1class Solution {
2    public int mirrorFrequency(String s) {
3        int[] freq1 = new int[26];
4        int[] freq2 = new int[10];
5 
6        for (char c : s.toCharArray()) {
7            if (c >= 'a' && c <= 'z') {
8                freq1[c - 'a']++;
9            } else {
10                freq2[c - '0']++;
11            }
12        }
13        int ans = 0;
14 
15        for (int i = 0; i < 26; i++) {
16            int opp = 25 - i;
17            if (i <= opp) {
18                ans += Math.abs(freq1[i] - freq1[opp]);
19            }
20        }
21 
22        for (int i = 0; i < 10; i++) {
23            int opp = 9 - i;
24            if (i <= opp) {
25                ans += Math.abs(freq2[i] - freq2[opp]);
26            }
27        }
28
29        return ans;
30    }
31}