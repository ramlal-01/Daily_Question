// Last updated: 6/8/2026, 9:23:31 pm
1class Solution {
2    int mini ; 
3    public int[] loudAndRich(int[][] richer, int[] quiet) {
4        int n = quiet.length ;
5        int arr[] = new int[n] ;
6
7        List<List<Integer>> adj = new ArrayList<>();
8        for( int i = 0 ; i<n ; i++ ) adj.add( new ArrayList<>() ) ;
9
10        for( int ele[] : richer ){
11            adj.get(ele[1]).add(ele[0]);
12        }
13        boolean vis[] = new boolean[n] ;
14
15        for( int i = 0 ; i<n ; i++ ){
16            mini = i  ;
17            dfs( i ,adj , vis , quiet ) ;
18            arr[i] = mini ;
19            Arrays.fill(vis,false);
20        }
21        return arr ;
22    }
23
24    public void dfs( int node , List<List<Integer>> adj ,boolean vis[] ,int[] quiet ){
25
26        vis[node] = true ;
27
28
29        for( int nei : adj.get(node) ){
30            if( !vis[nei] ){
31                if( quiet[nei]<quiet[mini] ){
32                    mini = nei ;
33                }
34                dfs( nei , adj , vis , quiet );
35            }
36        }
37    }
38}