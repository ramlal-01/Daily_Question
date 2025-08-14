// Last updated: 14/8/2025, 4:27:33 pm
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int pre[]= new int[nums.length];
        pre[0]= nums[0];
        for(int i=1; i<nums.length ; i++){
            pre[i]= pre[i-1] ^ nums[i];
        }
        int k= (int)Math.pow(2,maximumBit)-1;
        int res[] = new int[nums.length];
        int j=0;
        for( int i= nums.length-1 ; i>=0 ; i--){
            res[j++]= pre[i]^ k;
        }
        return res;
    }
}