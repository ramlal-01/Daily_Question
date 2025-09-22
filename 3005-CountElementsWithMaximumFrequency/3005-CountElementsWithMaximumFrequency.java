// Last updated: 22/9/2025, 2:33:43 pm
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = Integer.MIN_VALUE ; 
        for( int ele : nums) max = Math.max( max , ele );
        int[] map = new int[max+1];

        for( int ele : nums){
            map[ele]++;
        }
        int maxi = Integer.MIN_VALUE;
        for( int ele : map){
            maxi = Math.max( maxi , ele );
        }
        // System.out.println( maxi);
        int f = 0 ;
        for( int i=0 ; i<nums.length ; i++){ 
            if( map[nums[i]] == maxi) f++;
        }
        return f ;
    }
}