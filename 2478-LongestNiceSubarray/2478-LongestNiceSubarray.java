// Last updated: 14/8/2025, 4:26:38 pm
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int si=0;
        int ei =0;
        int ans =0;
        int len =1;

        while( ei< nums.length){

            while( (nums[ei]&ans) !=0){
                ans = ans^nums[si];
                si++;
            }
            ans^=nums[ei];
            len=Math.max( len , ei-si+1);
            ei++;
        }
        return len;
    }
}