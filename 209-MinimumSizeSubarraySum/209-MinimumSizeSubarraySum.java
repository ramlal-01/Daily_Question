// Last updated: 8/10/2025, 6:46:54 am
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE ;

        int left = 0 ;
        int right = 0 ;

        long sum = 0 ;
        while( right < nums.length){
            sum += nums[right];
            while( sum>=target) {
                min = Math.min( min , right - left +1);
                sum -= nums[left];
                left++ ;
            } 

            right ++ ;
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
      
    }
}