// Last updated: 5/10/2025, 6:24:16 pm
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> res = new HashSet<>();

        func( nums , res , 0 , new ArrayList<>() );

        return new ArrayList<>(res) ;
    }

    public void func( int nums[] , HashSet<List<Integer>> res , int ind , List<Integer> path ){
        if( ind> nums.length-1 ){
            res.add( new ArrayList<>( path ));
            return ;
        }

        func( nums, res , ind+1 , path );

        path.add( nums[ind] );
        func( nums , res , ind+1 , path );
        path.remove( path.size()-1 );
    }
}