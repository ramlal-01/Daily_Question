// Last updated: 30/12/2025, 3:48:04 pm
1class Solution {
2    public int countBattleships(char[][] board) {
3        int n = board.length ;
4        int m = board[0].length ;
5        boolean vis[][] = new boolean[n][m];
6        int c= 0 ;
7        for( int i = 0 ; i<n ; i++){
8            for( int j = 0 ; j<m ;j++){
9                if( board[i][j]=='X' && !vis[i][j] ){
10                    c++;
11                    dfs( board , vis , i , j );
12                }
13            }
14        }
15        return c ;
16    }
17
18    public void dfs( char[][] grid ,boolean vis[][] , int row , int col  ){ 
19        vis[row][col] = true ;
20        
21        int drow[] = {-1,0,1,0};
22        int dcol[] = {0,1,0,-1};
23
24        int n = grid.length ;
25        int m = grid[0].length ;
26
27        for( int i =0 ; i<4 ; i++){
28            int nrow = row+ drow[i] ;
29            int ncol = col + dcol[i];
30
31            if( nrow>=0 && ncol>=0 && nrow<n && ncol<m && !vis[nrow][ncol] && grid[nrow][ncol]=='X' ){
32                dfs( grid , vis , nrow , ncol );
33            }
34        }
35    }
36}