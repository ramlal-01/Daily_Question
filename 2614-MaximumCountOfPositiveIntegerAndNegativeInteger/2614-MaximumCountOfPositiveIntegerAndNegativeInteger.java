// Last updated: 14/8/2025, 4:26:12 pm
class Solution {
    public int maximumCount(int[] nums) {
        int pos =0 , neg=0;
        for( int ele : nums){
            if( ele> 0){
                pos++;
            }
            else if( ele<0) neg++;
        }
        return Math.max(pos,neg);
    }
}