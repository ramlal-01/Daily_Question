// Last updated: 14/8/2025, 4:27:30 pm
class Solution {
    public int arraySign(int[] nums) {
        int f=1;
        for( int i=0 ; i<nums.length; i++){
            if(nums[i]==0){
                return 0;
            }
            if( nums[i] >0){
                nums[i]=1;
            }
            if( nums[i]<0){
                nums[i]=-1;
            }
            f*=nums[i];
        }
        if( f >0){
            return 1;
        }
        if( f<0){
            return -1;
        }
        return 0;
    }
}