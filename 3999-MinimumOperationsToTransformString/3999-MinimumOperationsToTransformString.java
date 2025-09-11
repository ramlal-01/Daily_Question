// Last updated: 11/9/2025, 1:41:11 pm
class Solution {
    public int minOperations(String s) {
        int max=0;
        for (char ch : s.toCharArray()) {
            int c = (26 - (ch - 'a')) % 26;
            max = Math.max(max, c);
        }
        return max;
    }
}