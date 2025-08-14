// Last updated: 14/8/2025, 4:27:10 pm
class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                return i;
            }
           
        }
         return -1;
    }
}