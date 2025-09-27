// Last updated: 27/9/2025, 1:24:17 pm
class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE ;
        Arrays.sort(nums);
        int n = nums.length - 1;
        int prod1 = nums[n]*nums[n-1]*nums[n-2];

        int prod2 = nums[0]*nums[1]* nums[n];

        return Math.max( prod1 , prod2);
    }
}