// Last updated: 20/10/2025, 12:38:45 am
class Solution {
    public int climbStairs(int n) {
        int prev1 = 1 , prev = 1 ;
        int curr = 1 ;
        for( int i = 2 ; i<=n ; i++){
            curr = prev1 + prev ;

            prev1 = prev ;
            prev = curr ;
        }
        return curr ;
    }
}