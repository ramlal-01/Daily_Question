// Last updated: 12/9/2025, 1:17:18 pm
class Solution {
    static void dfs( boolean[][] visited , int[][] mat , int row , int col , int[] delrow , int[] delcol ){
        int m = mat.length;
        int n = mat[0].length ;
        visited[row][col] = true ;
        for( int k =0 ; k< 4 ; k++){
            int nrow = row+delrow[k];
            int ncol = col+ delcol[k];
            
            if( nrow>=0 && nrow< m && ncol>=0  && ncol <n && !visited[nrow][ncol] 
            && mat[nrow][ncol]==1){
                dfs( visited , mat , nrow , ncol, delrow, delcol );
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length ;
        int c=0;
        boolean visited[][] = new boolean[m][n];
        int delrow[] = { -1 ,0, 1,0};
        int delcol[] = { 0 ,1 , 0 , -1};

        for( int j = 0 ; j< n ; j++){
            
            if( !visited[0][j] && grid[0][j]==1){
                dfs( visited , grid , 0 , j , delrow, delcol);
            }
            
            if( !visited[m-1][j] && grid[m-1][j]== 1){
                dfs( visited , grid , m-1 , j , delrow, delcol);
            }
        }
        
        for( int i =0 ; i< m ; i++){
            if( !visited[i][0] && grid[i][0] == 1){
                dfs( visited , grid , i , 0, delrow, delcol);
            }
            if( !visited[i][n-1] && grid[i][n-1] == 1){
                dfs( visited ,  grid , i , n-1, delrow, delcol );
            }
        }
        
        for( int i=0 ; i<m ; i++){
            for( int j=0 ; j<n ; j++){
                if( !visited[i][j] && grid[i][j]==1){
                    c++;
                }
            }
        } 
        return c;
    }
}


 