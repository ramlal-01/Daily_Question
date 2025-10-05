// Last updated: 5/10/2025, 8:57:28 am
class Solution {
    
    public int longestSubsequence(int[] nums) { 
        int total = 0;
        boolean hasNonZero = false;
        for (int x : nums) {
            total ^= x;
            if (x != 0) hasNonZero = true;
        }

        if (total != 0) return nums.length;
        return hasNonZero ? nums.length - 1 : 0;
    }
 
}