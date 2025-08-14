// Last updated: 14/8/2025, 4:27:21 pm
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length*2];
        int k=nums.length;
        for(int i=0; i<nums.length; i++){
            res[i]=nums[i];
            res[k++]=nums[i];
        }
        return res;
    }
}