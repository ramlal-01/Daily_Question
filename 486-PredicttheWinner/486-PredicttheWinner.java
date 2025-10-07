// Last updated: 7/10/2025, 5:55:09 am
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int totscore = 0 ;

        for( int ele : nums) totscore+=ele;

        int n  = nums.length ;

        int p1 = solve( nums , 0 , n-1 );
        int p2 = totscore - p1 ;

        return p1>=p2 ;
    }

    public int solve( int[] nums , int i  , int j){
        if( i>j) return 0 ;
        if( i==j) return nums[i];

        int take1 = nums[i] + Math.min( solve( nums , i+2 , j), solve( nums, i+1 , j-1));
        int take2 = nums[j] + Math.min( solve( nums , i+1 , j-1) , solve( nums , i, j-2 ) );

        return Math.max( take1 , take2);
    }
}