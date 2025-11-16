// Last updated: 16/11/2025, 8:04:47 am
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort( nums );
        int n = nums.length ;
        int sum = 0 ;

        sum+= nums[n-1]+nums[n-2]- nums[0];

        return sum ;
    }
}