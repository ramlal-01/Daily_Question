// Last updated: 8/10/2025, 9:56:01 am
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length ;
        int subs = 1 ;
        int minsubs = nums[0];
        

        for( int i = 1 ; i<n ;i++){

            if( nums[i]-minsubs>k){
                subs++;
                minsubs = nums[i];
            } 
        }
        return subs;
    }
}