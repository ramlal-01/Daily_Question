// Last updated: 17/3/2026, 3:38:32 pm
1class Pair{
2    int row ;
3    int col ;
4    int dist ;
5    int k ;
6    Pair( int row , int col , int dist , int k ){
7        this.row = row ;
8        this.col = col ;
9        this.dist = dist ;
10        this.k = k ;
11    }
12}
13
14class Solution {
15    public int shortestPath(int[][] grid, int k) {
16        int m = grid.length ;
17        int n = grid[0].length ;
18
19        int dist[][][] = new int[m][n][k+1] ;
20
21        for (int i = 0; i < m; i++) {
22            for (int j = 0; j < n; j++) {
23                Arrays.fill(dist[i][j], Integer.MAX_VALUE);
24            }
25        }
26
27        dist[0][0][k] = 0 ;
28
29        PriorityQueue<Pair> pq=new PriorityQueue<>( (a,b)->a.dist - b.dist ) ; 
30
31        pq.add( new Pair(0 , 0 , 0 , k ) ) ;
32
33        int drow[] = { -1 , 0 , 1 , 0 };
34        int dcol[] = { 0 , 1 , 0 , -1 };
35
36        while( !pq.isEmpty() ){
37
38            Pair curr = pq.poll() ;
39            int row = curr.row ;
40            int col = curr.col ;
41            int dis = curr.dist ;
42            int obst = curr.k ;
43
44            if( row==m-1 && col==n-1 ) return dis ;
45            if (dis > dist[row][col][obst]) continue;
46
47            for( int i =0 ; i<4 ; i++ ){
48                int nrow = row + drow[i] ;
49                int ncol = col + dcol[i] ;
50
51                if( nrow>=0 && ncol>=0 && nrow<m && ncol<n ){
52                        
53                        int newK = obst - grid[nrow][ncol] ;
54                        
55                        if( newK>=0 ){
56
57                            if( dis+1 < dist[nrow][ncol][newK] ){
58
59                                dist[nrow][ncol][newK] = dis+1 ;
60                                pq.add( new Pair( nrow , ncol , dis+1 , newK ) );
61
62                            }
63                        }
64                        
65                    
66                    
67                }
68            }
69            
70        } 
71        return -1 ;
72    }
73}