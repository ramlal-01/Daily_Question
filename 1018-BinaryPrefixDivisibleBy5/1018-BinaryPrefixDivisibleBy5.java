// Last updated: 24/11/2025, 3:36:50 pm
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int n = nums.length ; 
        
        int rem = 0 ;
        for( int i = 0  ; i<n ; i++){
            rem = ( rem*2 + nums[i])%5 ;
            if( rem==0 ) ans.add(true);
            
            else ans.add(false);
        }
        return ans ;
    }
}