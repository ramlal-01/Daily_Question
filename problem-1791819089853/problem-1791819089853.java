// Last updated: 12/10/2026, 9:01:29 pm
1class Solution {
2    boolean vis[] ;
3    int cnt = 0 ;
4    public int minReorder(int n, int[][] arr) {
5        List<List<int[]>> adj = new ArrayList<>() ;
6
7        for( int i = 0 ; i<n ; i++ ){
8            adj.add( new ArrayList<>() );
9        }
10
11        for (int[] edge : arr) {
12            int u = edge[0];
13            int v = edge[1];
14
15            adj.get(u).add(new int[]{v, 1}); // u -> v
16            adj.get(v).add(new int[]{u, 0}); // v -> u
17        }
18
19        vis = new boolean[n] ;
20
21        
22        dfs( arr , adj , 0 ) ;
23        
24        return cnt ;
25    }
26    public void dfs( int[][] arr , List<List<int[]>> adj , int node ){
27        vis[node] = true ;
28
29        for( int nei[] : adj.get(node) ){
30            int next = nei[0] ;
31            int cost = nei[1] ;
32
33            if( !vis[next] ){
34                cnt+= cost ;
35                dfs( arr , adj , next ) ;
36
37            }
38            
39            
40        }
41    }
42}