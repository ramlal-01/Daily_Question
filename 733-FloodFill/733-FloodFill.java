// Last updated: 11/9/2025, 2:35:52 pm
class Pair{
    int sr;
    int sc;
    Pair( int sr , int sc){
        this.sr = sr ;
        this.sc = sc;
    }
}

class Solution {

    public void bfs (int[][] image ,int visited[][] , int sr , int sc , int color ){
        int m = image.length ;
        int n = image[0].length;
        int oldColor = image[sr][sc];    
        visited[sr][sc] = 1;
        Queue<Pair> q = new LinkedList<>();

        image[sr][sc] = color ;
        q.add(new Pair(sr, sc));

        int delrow[] = { -1 , 0 , 1 ,0};
        int delcol[] = { 0 , 1, 0 , -1 };

        while( !q.isEmpty()){
            int row = q.peek().sr ;
            int col = q.peek().sc ;
            q.poll();

            for( int k=0 ; k < 4 ; k++){
                int nrow = row + delrow[k];
                int ncol = col + delcol[k];

                if( nrow>=0 && nrow<m && ncol>=0 && ncol<n &&
                    visited[nrow][ncol]==0 && image[nrow][ncol]==oldColor ){
                    visited[nrow][ncol] = 1 ;
                    image[nrow][ncol] = color ;
                    q.add(new Pair(nrow , ncol));
                }
            }
        }        
    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length ;
        int n = image[0].length;

        int visited[][] = new int[m][n];

        bfs( image , visited ,  sr ,  sc ,  color );

        return image ;
    }
}