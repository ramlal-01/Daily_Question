// Last updated: 15/8/2026, 4:06:40 pm
1class Solution {
2    
3    public int longestSubsequence(int[] nums) { 
4        int total = 0;
5        boolean hasNonZero = false;
6        for (int x : nums) {
7            total ^= x;
8            if (x != 0) hasNonZero = true;
9        }
10
11        if (total != 0) return nums.length;
12        return hasNonZero ? nums.length - 1 : 0;
13    }
14 
15}