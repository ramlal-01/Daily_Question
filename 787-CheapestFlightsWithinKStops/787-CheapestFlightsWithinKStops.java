// Last updated: 18/3/2026, 8:05:41 am
1class Solution {
2    static void dfs( boolean[][] visited , char[][] mat , int row , int col , int[] delrow , int[] delcol ){
3        int m = mat.length;
4        int n = mat[0].length ;
5        visited[row][col] = true ;
6        for( int k =0 ; k< 4 ; k++){
7            int nrow = row+delrow[k];
8            int ncol = col+ delcol[k];
9            
10            if( nrow>=0 && nrow< m && ncol>=0  && ncol <n && !visited[nrow][ncol] 
11            && mat[nrow][ncol]=='O'){
12                dfs( visited , mat , nrow , ncol, delrow, delcol );
13            }
14        }
15    }
16    public void solve(char[][] board) {
17        int m = board.length;
18        int n = board[0].length ;
19        boolean visited[][] = new boolean[m][n];
20        int delrow[] = { -1 ,0, 1,0};
21        int delcol[] = { 0 ,1 , 0 , -1};
22        for( int j = 0 ; j< n ; j++){
23            
24            if( !visited[0][j] && board[0][j]=='O'){
25                dfs( visited , board , 0 , j , delrow, delcol);
26            }
27            
28            if( !visited[m-1][j] && board[m-1][j]== 'O'){
29                dfs( visited , board , m-1 , j , delrow, delcol);
30            }
31        }
32        
33        for( int i =0 ; i< m ; i++){
34            if( !visited[i][0] && board[i][0] == 'O'){
35                dfs( visited , board , i , 0, delrow, delcol);
36            }
37            if( !visited[i][n-1] && board[i][n-1] == 'O'){
38                dfs( visited ,  board , i , n-1, delrow, delcol );
39            }
40        }
41        
42        for( int i=0 ; i<m ; i++){
43            for( int j=0 ; j<n ; j++){
44                if( !visited[i][j] && board[i][j]=='O'){
45                    board[i][j] = 'X';
46                }
47            }
48        } 
49    }
50}
51
52 