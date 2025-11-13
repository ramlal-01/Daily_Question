// Last updated: 13/11/2025, 3:24:19 pm
class Solution {
    public int maxOperations(String s) {
        long ans = 0;
        long ones = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '1') {
                ones++;
            } else {
                if (i + 1 == n || s.charAt(i + 1) == '1') {
                    ans += ones;
                }
            }
        }

        return (int)ans;
    }
}