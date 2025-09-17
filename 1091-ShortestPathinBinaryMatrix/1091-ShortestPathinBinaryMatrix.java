// Last updated: 17/9/2025, 3:45:11 pm
class Pair{
    int dist ; 
    int row ; 
    int col ;
    Pair( int d , int r , int c){
        dist =d ;
        row = r ;
        col = c ;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
// Your code here
        int m = grid.length ;
        int n = m ; 
        int dist[][] = new int[m][n];

        if (grid[0][0] == 1 || grid[m-1][n-1] == 1) return -1;

        int[] source = {0,0};
        int[] destination = {m-1,m-1};
        for(int i=0 ; i<m ; i++){
            for( int j =0 ; j<n ; j++){
                dist[i][j] = Integer.MAX_VALUE ; 
            }
        }
        
        Queue<Pair> q = new LinkedList<>();

        q.add( new Pair( 1 , source[0], source[1]));
        
        dist[source[0]][source[1]]= 1 ;
        
        int delrow[] = {-1,-1, 0,1, 1,1,0,-1};
        int delcol[] = { 0, 1,1,1, 0, -1 ,-1,-1 };
            
        while(!q.isEmpty()){
            int dis = q.peek().dist ;
            int r = q.peek().row ; 
            int c = q.peek().col ;
            q.poll();
            
            
            for( int k = 0 ; k<8 ; k++){
                int nrow = r+ delrow[k];
                int ncol = c+ delcol[k];
                if( nrow>=0 && nrow<m && ncol>=0 && ncol<n && grid[nrow][ncol]==0 && dis+1 < dist[nrow][ncol] ){
                    dist[nrow][ncol] = dis+ 1;
                    q.add( new Pair(dis+1 , nrow , ncol));
                }
            }
        }
        
        return dist[destination[0]][destination[1]]!= Integer.MAX_VALUE ? dist[destination[0]][destination[1]] : -1;
    }
}