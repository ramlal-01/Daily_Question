// Last updated: 8/2/2026, 9:17:39 am
1class Solution {
2    public int minimumDeletions(String s) {
3        int res = 0;
4        int count = 0;  
5        
6        for (char c : s.toCharArray()) {
7            if (c == 'b') {
8                count++;
9            } else if (count != 0) { 
10                res++;
11                count--;
12            }
13        }
14        
15        return res;
16    }
17}