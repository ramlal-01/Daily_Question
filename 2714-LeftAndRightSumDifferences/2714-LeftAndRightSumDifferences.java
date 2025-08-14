// Last updated: 14/8/2025, 4:26:03 pm
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int prefix[] = new int[nums.length];
        prefix[0]=0;
        for(int i=1; i<nums.length ; i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }
        int suffix[] = new int[nums.length];
        suffix[nums.length-1]=0;
        for(int  i= nums.length-2; i>=0 ; i--){
            suffix[i]=suffix[i+1]+nums[i+1];
        }
        for(int i=0; i<nums.length ; i++){
            nums[i]= Math.abs( prefix[i]-suffix[i]);
        }
        return nums;
    }
}