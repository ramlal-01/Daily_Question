// Last updated: 11/9/2025, 1:41:12 pm
class Solution {
    public int minOperations(int[] nums) {
        for( int i=1 ; i< nums.length ; i++){

            if( nums[i]!= nums[0]) return 1;
        }
        return 0;
    }
}