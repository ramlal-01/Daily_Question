// Last updated: 14/10/2025, 6:21:02 am
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length ;
        Arrays.sort(nums);

        int closestsum = Integer.MAX_VALUE;

        for( int k =0 ; k<=n -3; k++){
            int i = k+1 ;
            int j = n-1;
            while( i<j){
                int sum = nums[k]+nums[j]+nums[i];

                if( Math.abs( target-sum) < Math.abs( target-closestsum)){
                    closestsum = sum;
                }

                if( sum< target) i++;
                else j--;
            }
        }
        return closestsum;
    }
}