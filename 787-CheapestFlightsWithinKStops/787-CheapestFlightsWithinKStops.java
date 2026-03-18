// Last updated: 18/3/2026, 8:18:19 am
1class Solution {
2    int n = 0 ;
3    int m = 0 ;
4    int drow[] = { -1,0,1,0} ;
5    int dcol[] = { 0,1,0,-1} ;
6    public void solve(char[][] board) {
7        n = board.length ;
8        m = board[0].length ;
9
10        boolean vis[][] = new boolean[n][m] ;
11
12        for( int i =0 ; i<m; i++ ){
13            if( !vis[0][i] && board[0][i]=='O'){
14                dfs( board , vis , 0 , i );
15            }
16            if( !vis[n-1][i] && board[n-1][i]=='O'){
17                dfs( board , vis , n-1 , i );
18            }
19        }
20        for( int i =0 ; i<n; i++ ){
21            if( !vis[i][0] && board[i][0]=='O'){
22                dfs( board , vis , i , 0 );
23            }
24            if( !vis[i][m-1] && board[i][m-1]=='O'){
25                dfs( board , vis , i , m-1 );
26            }
27        }
28
29        for( int i =0 ; i<n ; i++ ){
30            for( int j=0 ; j<m ; j++ ){
31                if( !vis[i][j] && board[i][j]=='O' ){
32                    board[i][j] = 'X' ;
33                }
34            }
35        }
36    }
37
38    public void dfs( char[][] board , boolean[][] vis , int r , int c ){
39        vis[r][c] = true ;
40
41        for( int i = 0 ; i< 4 ; i++ ){
42            int nrow = r + drow[i] ;
43            int ncol = c + dcol[i] ;
44
45            if( nrow>=0 && ncol>=0 && nrow<n && ncol<m
46                && board[nrow][ncol]=='O' && !vis[nrow][ncol] ){
47                dfs( board , vis , nrow , ncol );
48            }
49        }
50    }
51}