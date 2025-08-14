// Last updated: 14/8/2025, 4:25:19 pm
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int a=0;
        int n=nums.length;
        while(k>0){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(min>nums[i]){
                    min=nums[i];
                    a=i;
                }
            }
            k--;
            
            nums[a]=nums[a]*multiplier;
            
        }
        return nums;
    }
}