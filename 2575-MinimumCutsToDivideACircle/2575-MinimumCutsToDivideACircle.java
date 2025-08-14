// Last updated: 14/8/2025, 4:26:19 pm
class Solution {
    public int numberOfCuts(int n) {
        if( n==1){
            return 0;
        }
        if( n%2==0){
            return n/2;
        }
        return n;
    }
}