// Last updated: 11/9/2025, 10:44:22 am
class Pair{
    int first ;
    int second ;
    Pair( int first , int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public void bfs( int ro , int co , int[][]visited , char[][] grid){
        visited[ro][co] = 1; 
        int m = grid.length ;
        int n = grid[0].length ;

        Queue<Pair> q = new LinkedList<Pair>();
        q.add( new Pair(ro , co));

        while( !q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second ;
            q.poll() ;
 
            int[] drow = {-1, 0, 1, 0};
            int[] dcol = {0, 1, 0, -1};

            for (int k = 0; k < 4; k++) {
                int nrow = row + drow[k];
                int ncol = col + dcol[k];

                if (nrow >= 0 && nrow < m && ncol >= 0 && ncol < n
                    && grid[nrow][ncol] == '1' && visited[nrow][ncol] == 0) {
                    visited[nrow][ncol] = 1;
                    q.add(new Pair(nrow, ncol));
                }
            }

        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ;
        int visited[][] = new int[m][n];
        int c=0;
        for( int i=0 ; i<m ; i++){
            for ( int j=  0 ; j< n ; j++){
                if( visited[i][j]==0 && grid[i][j]=='1'){
                    c++;
                    bfs( i , j , visited , grid );
                }
            }
        }
        return c;
    }
}