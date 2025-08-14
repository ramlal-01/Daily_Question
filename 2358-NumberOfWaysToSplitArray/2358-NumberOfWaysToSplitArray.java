// Last updated: 14/8/2025, 4:26:45 pm
class Solution {
    public int waysToSplitArray(int[] nums) {
        long left=0,right;
          int c=0;
          long sum=0;
          for(int num:nums){
          sum+=num;
          }
          for(int i=0;i<nums.length -1;i++){
            left+=nums[i];
            right=sum-left;
            if(left>=right){
              c++;
            } 
        }
        return c;
    }
}