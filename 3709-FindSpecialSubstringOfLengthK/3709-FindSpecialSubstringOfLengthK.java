// Last updated: 14/8/2025, 4:25:08 pm
class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();
        if (k > n) return false;  
        for (int i = 0; i <= n - k; i++) {
            char ch = s.charAt(i); 
            boolean Val = true;
            for (int j = i; j < i + k; j++) {
                if (s.charAt(j) != ch) {
                    Val = false;
                    break;
                }
            }
            if (Val) { 
                if ((i == 0 || s.charAt(i - 1) != ch) && (i + k == n || s.charAt(i + k) != ch)) {
                    return true;
                }
            }
        }
        
        return false;
    }
}