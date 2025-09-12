// Last updated: 12/9/2025, 12:36:33 pm
class Solution {
    static void dfs( boolean[][] visited , char[][] mat , int row , int col , int[] delrow , int[] delcol ){
        int m = mat.length;
        int n = mat[0].length ;
        visited[row][col] = true ;
        for( int k =0 ; k< 4 ; k++){
            int nrow = row+delrow[k];
            int ncol = col+ delcol[k];
            
            if( nrow>=0 && nrow< m && ncol>=0  && ncol <n && !visited[nrow][ncol] 
            && mat[nrow][ncol]=='O'){
                dfs( visited , mat , nrow , ncol, delrow, delcol );
            }
        }
    }
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length ;
        boolean visited[][] = new boolean[m][n];
        int delrow[] = { -1 ,0, 1,0};
        int delcol[] = { 0 ,1 , 0 , -1};
        for( int j = 0 ; j< n ; j++){
            
            if( !visited[0][j] && board[0][j]=='O'){
                dfs( visited , board , 0 , j , delrow, delcol);
            }
            
            if( !visited[m-1][j] && board[m-1][j]== 'O'){
                dfs( visited , board , m-1 , j , delrow, delcol);
            }
        }
        
        for( int i =0 ; i< m ; i++){
            if( !visited[i][0] && board[i][0] == 'O'){
                dfs( visited , board , i , 0, delrow, delcol);
            }
            if( !visited[i][n-1] && board[i][n-1] == 'O'){
                dfs( visited ,  board , i , n-1, delrow, delcol );
            }
        }
        
        for( int i=0 ; i<m ; i++){
            for( int j=0 ; j<n ; j++){
                if( !visited[i][j] && board[i][j]=='O'){
                    board[i][j] = 'X';
                }
            }
        } 
    }
}

 