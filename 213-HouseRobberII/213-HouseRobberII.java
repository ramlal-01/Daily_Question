// Last updated: 20/10/2025, 2:40:49 pm
class Solution {
    public int rob(int[] nums) {
        int prev1 =0 ;
        int prev = nums[0];
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        for( int i = 1 ; i<n-1 ; i++){
            int take = nums[i] ;
            if( i>1 ) take+= prev1 ;

            int nottake = prev ;
            int curr = Math.max( take  , nottake);
            prev1 = prev ;
            prev = curr ;
        }
        // System.out.println(prev);
        int second =0 ;
        int first = nums[1];

        for( int i = 2 ; i<n ; i++){
            int take = nums[i] + second ;

            int nottake = first ;
            int curr = Math.max( take  , nottake);
            second = first ;
            first  = curr ;
        }
        // System.out.println(first);
        return Math.max( prev , first );
    }
}