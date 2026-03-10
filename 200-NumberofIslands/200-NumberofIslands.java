// Last updated: 10/3/2026, 11:07:30 am
1class Solution {
2    public int numIslands(char[][] grid) {
3        int m = grid.length ;
4        int n = grid[0].length ;
5
6        boolean vis[][] = new boolean[m][n] ;
7
8        int cnt = 0 ;
9        for( int i =0 ; i<m ; i++ ){
10            for( int j= 0 ; j<n ; j++ ){
11                if(grid[i][j]=='1' && !vis[i][j]){
12                    dfs( grid , i , j , vis) ;
13                    cnt++ ;
14                }
15            }
16        }
17
18        return cnt ;
19    }
20
21    public void dfs( char[][] grid , int r , int c , boolean vis[][]){
22        if( grid[r][c]=='0' || vis[r][c] ){
23            return  ;
24        }
25        vis[r][c] = true ;
26
27        int row[] = { -1 , 0 , 1 , 0} ;
28        int col[] = {  0, 1 , 0 , -1 } ;
29
30        for( int i = 0 ; i<4 ; i++ ) {
31            int nrow = r+ row[i] ;
32            int ncol = c + col[i] ;
33
34            if( nrow>=0 && ncol>=0 && nrow<grid.length && ncol<grid[0].length && !vis[nrow][ncol] && grid[nrow][ncol]=='1'){
35                dfs( grid , nrow , ncol , vis ) ;
36            }
37        }           
38        return  ;
39    }
40}