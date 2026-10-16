// Last updated: 16/10/2026, 10:05:09 pm
1class Solution {
2    public int minRotations(String s) {
3        int cur = 0, result = 0;
4        for (char c : s.toCharArray()) {
5            int digit = c - '0';
6            int d = (digit - cur + 10) % 10; 
7            result += Math.min(d, 10 - d);  
8            cur = digit;
9        }
10        return result;
11    }
12}