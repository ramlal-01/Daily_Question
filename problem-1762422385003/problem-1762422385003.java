// Last updated: 6/11/2025, 3:16:25 pm
class Solution {
    public int minInsertions(String s) {
        return s.length() - longestPalindromeSubseq(s);
    }

    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        int n = s.length();

        int dp[] = new int[n+1];

        for( int i =1 ; i<=m ; i++){
            int temp[] = new int[n+1];
            for( int j = 1 ; j<=n ; j++){
                if( s.charAt(i-1)==s.charAt(n-j)){
                    temp[j] =1+ dp[j-1];
                }
                else{
                    temp[j] = Math.max( dp[j] , temp[j-1]);
                }
            }
            dp = temp;
        }
        return dp[n];
    }
}