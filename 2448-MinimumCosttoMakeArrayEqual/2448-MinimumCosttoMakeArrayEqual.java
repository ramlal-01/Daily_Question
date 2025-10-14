// Last updated: 14/10/2025, 10:54:05 am
class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length ; 
        int min = Integer.MAX_VALUE ;
        int max = 0 ;
        for( int ele : nums){
            min = Math.min( min ,ele );
            max = Math.max( max , ele );
        }
        int low = min ; 
        int high = max ;
        long ans = Long.MAX_VALUE ;

        while( low<=high ){
            int mid = low + (high - low)/2 ;

            long cost1 = solve( nums , cost , mid);
            long cost2 = solve( nums , cost , mid+1 );

            ans = Math.min( cost1 , cost2);
            if( cost1 < cost2 ){
                high = mid-1 ;
            }
            else{
                low = mid+1 ;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans ; 
    }

    public long solve( int[] nums , int[]  cost , int mid){
        long ans = 0 ;
        for( int i = 0 ; i<nums.length ; i++){
            ans += (long)Math.abs(nums[i]- mid) * cost[i];
        }
        return ans ;
    } 
}