// Last updated: 11/10/2025, 8:34:07 pm
class Solution {
    public int longestSubarray(int[] nums) {
        int curr = 2 ;
        int maxlen = 2;

        for( int i =2 ;i<nums.length; i++){
            if( nums[i] == nums[i-1] + nums[i-2] ){
                curr++;
            }
            else{
                curr = 2;
            }

            maxlen = Math.max( maxlen , curr);
            
        }
        return maxlen;
    }
}