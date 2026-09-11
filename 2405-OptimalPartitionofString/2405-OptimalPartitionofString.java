// Last updated: 12/9/2026, 1:18:17 am
1class Solution {
2    public int partitionString(String s) {
3        int idx = 0;
4        int count = 0;
5        Map<Character, Boolean> mp = new HashMap<>();  
6        while (idx < s.length()) {
7            if (mp.containsKey(s.charAt(idx))) {  
8                count++;  
9                mp.clear();  
10            }
11            mp.put(s.charAt(idx), true); 
12            idx++;  
13        }
14        return count + 1;  
15    }
16}