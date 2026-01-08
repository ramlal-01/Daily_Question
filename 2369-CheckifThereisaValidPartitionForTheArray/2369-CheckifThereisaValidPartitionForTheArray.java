// Last updated: 8/1/2026, 1:50:00 pm
1class Solution {
2    public int maxRepeating(String sequence, String word) {
3        int c = 0;
4        String curr=word;
5
6        while (sequence.contains(curr)) {
7            c++;
8            curr+=word;
9        }
10        return c;
11    }
12}
13