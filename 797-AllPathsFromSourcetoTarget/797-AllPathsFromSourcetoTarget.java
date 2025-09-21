// Last updated: 21/9/2025, 11:05:12 pm
class Solution {
    public void dfs( int[][] graph  , int node ,    List<List<Integer>> list , List<Integer> ans ){ 
        ans.add( node);
        for( int ele : graph[node]){ 
                dfs( graph , ele , list , ans );
        } 
        if( node == graph.length -1 ) list.add(new ArrayList<>(ans));
        ans.remove( ans.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();  
            List<Integer> ans = new ArrayList<>();
            dfs( graph   , 0 , list , ans); 
        return list ;
    }
}