// Last updated: 11/9/2025, 4:11:00 pm
class Pair{
    int r ;
    int c ;
    int t;
    Pair( int r, int c , int t){
        this.r = r;
        this.c = c ;
        this.t = t ;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length ;
        int n = grid[0].length ; 
        int fresh = 0 ;
        int ans =0 ;
        Queue<Pair> q = new LinkedList<>();
        for( int i =0 ; i< m ; i++){
            for( int j=0 ; j< n ; j++){
                if( grid[i][j]==2){ 
                    q.add( new Pair(i,j,0));
                }
                if ( grid[i][j]==1){
                    fresh++;
                }
            }
        } 

        while( !q.isEmpty() ){
            int row = q.peek().r;
            int col = q.peek().c;
            int time = q.peek().t ;

            q.poll();
            ans = time ;
            int[] delrow =  {-1 , 0 , 1, 0  };
            int[] delcol =  { 0 , 1, 0 , -1 };

            for( int k = 0 ; k< 4 ; k++){
                int nrow = row+ delrow[k];
                int ncol = col + delcol[k];

                if( nrow>=0 && nrow<m && ncol>=0 && ncol<n
                 && grid[nrow][ncol]==1 ){
                    grid[nrow][ncol]=2 ;
                    q.add( new Pair(nrow , ncol , time+1));
                    fresh--;
                }
            }
        }

        if( fresh > 0 ) return -1 ;

        return ans ;
    }
}