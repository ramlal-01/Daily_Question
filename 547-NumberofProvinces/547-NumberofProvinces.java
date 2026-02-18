// Last updated: 18/2/2026, 3:35:12 pm
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length ;
4        List<List<Integer>> adj = new ArrayList<>();
5        for( int i =0 ; i<n ; i++ ){
6            adj.add( new ArrayList<>());
7        }
8
9        for( int i =0 ; i<n ; i++ ){
10            for( int j = 0 ; j< isConnected[i].length ; j++ ){
11                if( isConnected[i][j]==1 ){
12                    adj.get(i).add(j);
13                    adj.get(j).add(i);
14                }
15            }
16        }
17
18        boolean vis[] = new boolean[n] ;
19        int c = 0 ;
20        for( int i =0 ; i<n ; i++ ){
21            if( !vis[i] ){
22                dfs( adj , i , vis );
23                c++;
24            }
25        }
26        return c ;
27    }
28
29    public void dfs( List<List<Integer>> adj , int node , boolean[] vis ){
30        vis[node] = true ;
31
32        for( int ele : adj.get(node) ){
33            if( !vis[ele]){
34                dfs( adj , ele , vis );
35            }
36        }
37    }
38
39
40}