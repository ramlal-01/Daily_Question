// Last updated: 8/10/2025, 6:29:05 am
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0 ;
        int right = 0 ;
        int f = 1 ;
        int c = 0 ;
        if( k<=1 ) return 0 ;
        while( right<nums.length ){
            f= f* nums[right] ; 
            while( f>=k ) {
                
                f = f/ nums[left] ;
                left++;
            }
            c += (right - left + 1);
            right++ ;
        }
        return c ;
    }

    
}