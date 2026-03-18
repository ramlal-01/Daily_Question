// Last updated: 18/3/2026, 7:19:37 am
1class Solution {
2    public void dfs( int[][] graph ,int node ,List<List<Integer>> list , List<Integer> ans ){ 
3        ans.add( node);
4        for( int ele : graph[node]){ 
5                dfs( graph , ele , list , ans );
6        } 
7        if( node == graph.length -1 ) list.add(new ArrayList<>(ans));
8        ans.remove( ans.size()-1);
9    }
10    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
11        List<List<Integer>> list = new ArrayList<>();  
12            List<Integer> ans = new ArrayList<>();
13            dfs( graph   , 0 , list , ans); 
14        return list ;
15    }
16}