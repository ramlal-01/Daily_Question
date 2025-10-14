// Last updated: 14/10/2025, 6:22:16 am
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length ;
        int closest = Integer.MAX_VALUE ;
        Arrays.sort( nums );
        for( int k = 0 ; k<=n-3 ; k++){
            int i = k+1 ;
            int j = n-1 ;

            while(i<j){
            int sum = nums[i] + nums[j] + nums[k];

            if( Math.abs( target-sum) < Math.abs( target-closest)){
                closest = sum ;
            }

            if( sum<target) i++;
            else j--;
            }
        }
        return closest;
    }
}