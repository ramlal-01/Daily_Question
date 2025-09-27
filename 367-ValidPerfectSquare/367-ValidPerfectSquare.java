// Last updated: 27/9/2025, 10:53:28 pm
class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 1 ;
        long high = num;
        while( low<=high){
            long mid = low+ (high-low)/2;
            long psq = mid*mid;

            if( psq == num){
                return true;
            }
            else if( psq> num){
                high = mid-1;
            }
            else {
                low = mid+1 ;
            }
        }
        return false;
    }
}