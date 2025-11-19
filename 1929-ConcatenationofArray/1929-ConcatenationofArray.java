// Last updated: 19/11/2025, 9:37:28 pm
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0 ;
        int f = 0 ; 

        for ( int ele : nums){
            if( ele == 1){
                f++;
            }

            else {
                f=0;
            }

            max = Math.max( f, max);
        }
        return max; 
    }
}