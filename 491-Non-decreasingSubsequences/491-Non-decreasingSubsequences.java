// Last updated: 5/10/2025, 6:19:42 pm
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
        
        func( nums , res , 0 , -100 , new ArrayList<>() );

        return new ArrayList<>(res) ;
    }

    public void func( int nums[] , HashSet<List<Integer>> res , int ind , int last , List<Integer> path ){
        if (ind >= nums.length) {
            if (path.size() >= 2) {
                res.add(new ArrayList<>(path));
            }
            return;
        }

        // not pick
        func( nums , res , ind+1 , last , path );

        // pick
        if( nums[ind]>= last ){
            path.add( nums[ind] );
            func( nums , res , ind+1 , nums[ind] , path );
            path.remove( path.size()-1 );
        }
    }
}