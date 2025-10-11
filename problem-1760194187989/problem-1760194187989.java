// Last updated: 11/10/2025, 8:19:47 pm
class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        int[] prefix = new int[n];
        
        prefix[0] = s.charAt(0)-'a' + 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1]+(s.charAt(i)-'a'+1);
        }
        
        int total = prefix[n - 1];
         for (int i = 0; i < n - 1; i++) {
            int left = prefix[i];
            int right = total - left;
            if (left == right) return true;
        }
        
        return false;
    }
}
