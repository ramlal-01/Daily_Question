// Last updated: 30/9/2025, 11:14:49 pm
class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int i = 0, j = 0, maxf = 0, ans = 0;
        while (j < s.length()) {
            arr[s.charAt(j) - 'A']++;
            maxf = Math.max(maxf, arr[s.charAt(j) - 'A']);
            while (j - i + 1 - maxf > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}