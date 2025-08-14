// Last updated: 14/8/2025, 4:25:54 pm
class Solution {
    public int sumOfSquares(int[] nums) {
        int n= nums.length;
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(n%(i+1)==0){
                r+=nums[i]*nums[i];
                // System.out.println(nums[i]);
            }
        }
        return r;
    }
}