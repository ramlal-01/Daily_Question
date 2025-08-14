// Last updated: 14/8/2025, 4:27:26 pm
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int p1 = 0;
        int p2 = nums.length-1;
        int max = 0;
        for(int i=0 ; i<nums.length/2 ; i++){
            max = Math.max(max,nums[p1]+ nums[p2]);
            p1++;
            p2--;
        }
        return max;
    }
}