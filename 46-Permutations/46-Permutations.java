// Last updated: 14/10/2025, 5:01:28 am
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int vis[] = new int[nums.length];
        helper( nums , res , new ArrayList<>() , vis );
        return res ;
    }

    public void helper( int[] nums , List<List<Integer>> res , List<Integer> path , int[] vis ){
        if( path.size()==nums.length){
            res.add( new ArrayList<>(path));
            return;
        }

        for( int i =0 ; i<nums.length ; i++){
            if( vis[i]!=0){
                continue ;
            }
                vis[i]=1 ;
                path.add(nums[i]);
                helper( nums , res , path, vis);
                path.remove( path.size()-1);
                vis[i]=0;
            
            
        }
    }
}