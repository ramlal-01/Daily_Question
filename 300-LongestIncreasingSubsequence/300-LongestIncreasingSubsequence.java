// Last updated: 4/11/2025, 11:15:31 am
class Solution { 
    public int lengthOfLIS(int[] nums) {
        int n = nums.length ; 
        int dp[] = new int[n];

        Arrays.fill( dp , 1 );

        for( int i = 1 ; i< n ;i++){
            for( int j = 0 ; j<i ; j++){
                if( nums[i] > nums[j] ){
                    if( dp[j]+1 > dp[i]) dp[i] = 1 + dp[j] ;
                }
            }
        }
        
        int max = dp[0] ;

        for( int ele : dp ){
            max = Math.max ( ele , max );
        }
        
        return max;
    }
}