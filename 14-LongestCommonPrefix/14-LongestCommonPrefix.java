// Last updated: 27/3/2026, 10:58:25 pm
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String s1 = strs[0];
5        String s2 = strs[strs.length-1];
6        int ind = 0;
7        while(ind< s1.length()&& ind< s2.length()){
8            if(s1.charAt(ind)==s2.charAt(ind)) ind++;
9            else break;
10            
11        }
12        return s1.substring(0, ind);
13    }
14}