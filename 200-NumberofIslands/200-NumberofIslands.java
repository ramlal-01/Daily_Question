// Last updated: 30/12/2025, 11:49:46 am
1class Solution {
2    public int numIslands(char[][] grid) {
3        int n = grid.length ;
4        int m = grid[0].length ;
5        boolean vis[][] = new boolean[n][m];
6        int c= 0 ;
7        for( int i = 0 ; i<n ; i++){
8            for( int j = 0 ; j<m ;j++){
9                if( grid[i][j]=='1' && !vis[i][j] ){
10                    c++;
11                    dfs( grid , vis , i , j );
12                }
13            }
14        }
15        return c ;
16    }
17
18    public void dfs( char[][] grid ,boolean vis[][] , int row , int col  ){
19        if( vis[row][col]) return ;
20
21        vis[row][col] = true ;
22        
23        int drow[] = {-1,0,1,0};
24        int dcol[] = {0,1,0,-1};
25
26        int n = grid.length ;
27        int m = grid[0].length ;
28
29        for( int i =0 ; i<4 ; i++){
30            int nrow = row+ drow[i] ;
31            int ncol = col + dcol[i];
32
33            if( nrow>=0 && ncol>=0 && nrow<n && ncol<m && !vis[nrow][ncol] && grid[nrow][ncol]=='1' ){
34                dfs( grid , vis , nrow , ncol );
35            }
36        }
37    }
38}