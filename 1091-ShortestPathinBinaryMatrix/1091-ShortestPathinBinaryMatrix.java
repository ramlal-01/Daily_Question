// Last updated: 2/1/2026, 11:46:21 am
1class Pair{
2    int r ;
3    int c ;
4    int d ;
5    Pair( int r , int c, int d){
6        this.r = r ;
7        this.c = c ;
8        this.d = d ;
9    }
10}
11class Solution {
12    public int shortestPathBinaryMatrix(int[][] grid) {
13        int n = grid.length ;
14        int mat[][] = new int[n][n];
15        
16        for( int ele[] : mat ) {
17            Arrays.fill( ele , Integer.MAX_VALUE );
18        }
19
20        if (grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
21
22        PriorityQueue<Pair> pq = new PriorityQueue<>( (a,b) -> a.d-b.d );
23
24        mat[0][0] = 1 ;
25        pq.add( new Pair( 0 , 0 , 1 ));
26
27        int drow[] = {-1,-1,-1,0,1,1,1,0};
28        int dcol[] = {-1,0,1,1,1,0,-1,-1};
29         
30        while( !pq.isEmpty() ){
31            Pair curr = pq.poll() ;
32            
33            int row = curr.r ;
34            int col = curr.c ;
35            int dist = curr.d ;
36
37            if( row==n-1 && col==n-1 ) return dist ;
38
39            for( int i =0 ; i<8 ; i++){
40                int nrow = row + drow[i];
41                int ncol = col + dcol[i];
42
43                if( nrow>=0 && ncol>=0 && nrow<n && ncol<n && grid[nrow][ncol]!=1 ){
44                    int newdist = dist + 1 ;
45                    if( newdist < mat[nrow][ncol] ){
46                        mat[nrow][ncol] = newdist ;
47                        pq.add( new Pair(nrow , ncol , newdist ) );
48                    }
49                }
50            }
51        }
52
53        return  mat[n-1][n-1]  == Integer.MAX_VALUE ? -1 : mat[n-1][n-1] ;
54    }
55}