// Last updated: 25/10/2025, 1:57:11 am
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for( int ele : nums){
            sum+= ele;
        }
        if( sum%2!=0 ) return false;
        return helper( nums.length , sum/2 , nums);
    }

    public boolean helper( int n , int k , int[] nums){
        boolean[] dp = new boolean[k+1];

        dp[0] = true;
        if( nums[0]<=k) dp[nums[0]] = true ;

        for( int i = 1; i<n ; i++){
            boolean cur[] = new boolean[k+1];
            cur[0] = true ;
            for( int j = 0 ; j<=k; j++){
                boolean nottake = dp[j];
                boolean take = false;
                if( nums[i]<=j){
                    take = dp[j-nums[i]];
                }
                cur[j] = take || nottake;

            }
            dp = cur ;
        }
        return dp[k];
    }
}