// Last updated: 14/8/2025, 4:28:05 pm
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int f=0;
        for( int i=0 ; i<nums.length ; i++){
            for( int j=i ; j<nums.length ; j++ ){
                if( nums[i]==nums[j] && i<j ){
                    f++;
                }
            }
        }
        return f;
    }
}