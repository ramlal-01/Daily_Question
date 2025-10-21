// Last updated: 22/10/2025, 1:19:26 am
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort( nums );
        int n = nums.length ; 

        for( int i = 0 ; i<n ; i++){
            if( i>0 && nums[i]==nums[i-1]) continue ;

            for( int j = i+1 ; j<n;){
                int p = j+1 , q = n-1 ;

                while( p<q ){
                    long sum = (long)nums[i] + nums[j] + nums[p] + nums[q];

                    if( sum == target ){
                        list.add( Arrays.asList( nums[i] , nums[j] , nums[p], nums[q]));
                        p++; 
                        q--;
                        while( p<q && nums[p]==nums[p-1]) p++; 
                    }
                    else if( sum<target){
                        p++;
                    }
                    else{
                        q--;
                    }
                    
                }
                j++;
                while( j<n && nums[j]==nums[j-1]) j++;
            }
        }
        return list;
    }
}