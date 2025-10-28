// Last updated: 28/10/2025, 11:38:52 am
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0 ;

        for( int ele : nums){
            total += ele;
        }

        int s1  = target+total;
        if( s1%2!=0 || s1<0) return 0 ;

        s1 = ( target + total )/2 ;

        return subsetsum( nums , s1 );

    }

    public int subsetsum( int[] nums , int target){
        int dp[] = new int[target+1];

        dp[0] = 1 ;

        for( int i = 0 ; i<nums.length ; i++){
            for( int j = target ; j>=nums[i] ; j-- ){
                dp[j] = dp[j] + dp[ j-nums[i]];
            }
        }

        return dp[target];
    }
}