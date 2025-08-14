// Last updated: 14/8/2025, 4:28:52 pm
class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0 , l=0 , r=0 , zeroes=0;
        while( r<nums.length){
            if(nums[r]==0) zeroes++;
            
            if(zeroes>k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            } 
             maxlen= Math.max( r-l+1 , maxlen);
            r++;
        }
        return maxlen;
    }
}