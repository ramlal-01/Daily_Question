// Last updated: 14/8/2025, 4:25:40 pm
class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        int c=0;
        

        for(int i=1; i<nums.length; i++){
            prefix[i]= prefix[i-1]+ nums[i];
            if(prefix[i]==0){
                c++;
            }
        }
        return c;
    }
}