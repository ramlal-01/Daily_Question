// Last updated: 15/10/2025, 4:45:22 pm
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0 ;
        if( nums.length==1) return true; 
        for( int i =0 ; i< nums.length-1 ; i++){
            if( i > max ) return false ;
            max = Math.max( max , i+ nums[i]);

            if( max >= nums.length-1){
                return true ;
            }
        } 
        return false ;
    }
}