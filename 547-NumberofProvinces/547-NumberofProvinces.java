// Last updated: 18/2/2026, 3:40:05 pm
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length ; 
4
5        boolean vis[] = new boolean[n] ;
6        int c = 0 ;
7        for( int i =0 ; i<n ; i++ ){
8            if( !vis[i] ){
9                dfs( isConnected , i , vis );
10                c++;
11            }
12        }
13        return c ;
14    }
15
16    public void dfs( int[][] isConnected , int node , boolean[] vis ){
17        vis[node] = true ;
18
19        for( int ele = 0 ; ele <isConnected[node].length ; ele++){
20            if( !vis[ele] && isConnected[node][ele]==1 ){
21                dfs( isConnected , ele , vis );
22            }
23        }
24    }
25
26
27}