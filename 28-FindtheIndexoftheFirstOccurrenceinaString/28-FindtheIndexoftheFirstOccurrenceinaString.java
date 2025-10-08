// Last updated: 8/10/2025, 9:34:01 am
class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length(); 
        int n = needle.length() ;
        if (m == 0) return 0;
        for( int i = 0; i<=m-n ; i++){
            int j = 0 ;
            while( j<n && haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if( j==n) return i;
        }
        return -1 ;
    }
}