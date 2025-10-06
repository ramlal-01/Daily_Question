// Last updated: 6/10/2025, 2:01:34 pm
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        helper( nums , res , new ArrayList<>()  , vis);
        return res ;
    }

    public void helper( int[] nums , List<List<Integer>> res , List<Integer> path , boolean[] vis ){
        if( path.size()==nums.length){
            res.add( new ArrayList<>(path));
            return ;
        }
        for( int i =0 ; i<nums.length ; i++ ){
            if( vis[i]) continue ;

            vis[i]= true;;
            path.add( nums[i] );
            helper( nums , res , path , vis );
            path.remove( path.size()-1);
            vis[i] = false ;
        }

    }
}