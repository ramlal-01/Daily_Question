// Last updated: 12/9/2025, 11:54:13 am
class Pair{
    int r ; 
    int c ;
    int d ;
    Pair( int row , int col , int dist ){
        r = row ;
        c = col ;
        d = dist ;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length ;
        int ans[][] = new int[m][n] ;
        boolean visited[][] = new boolean[m][n];
        
        Queue<Pair> q = new LinkedList<>();
        
        for( int i =0 ; i< m ; i++){
            for( int j=0 ; j< n ; j++){
                if( mat[i][j] == 0 ){
                    visited[i][j] = true ;
                    q.add( new Pair( i , j , 0));
                }
            }
        }
        
        while( !q.isEmpty()){
            int row = q.peek().r ;
            int col = q.peek().c ;
            int dist = q.peek().d;
            q.poll();
            
            ans[row][col] = dist ;
            
            int delrow[] = { -1 , 0 , 1 ,0 };
            int delcol[] = { 0 , 1, 0 , -1 };
            
            for( int k = 0 ; k< 4 ; k++){
                int nrow = row + delrow[k];
                int ncol = col + delcol[k];
                
                if( nrow>=0 && nrow<m && ncol>=0 && ncol< n 
                && !visited[nrow][ncol] ){
                    visited[nrow][ncol] = true ;
                    q.add( new Pair( nrow , ncol , dist+1 ));
                }
            }
        }
        
        return ans ;
    }
}