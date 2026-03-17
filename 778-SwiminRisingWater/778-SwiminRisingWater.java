// Last updated: 17/3/2026, 12:00:17 pm
1class Pair{
2    int row ;
3    int col  ;
4    int time ;
5    Pair(int row , int col , int time){
6        this.row = row ;
7        this.col = col ;
8        this.time = time ;
9    }
10}
11class Solution {
12    public int swimInWater(int[][] grid) {
13        int n = grid.length ;
14        PriorityQueue<Pair> q = new PriorityQueue<>( (a,b)-> a.time - b.time ) ;
15 
16        q.add( new Pair(0,0,grid[0][0]));
17
18        int[][] dist = new int[n][n] ;
19        for( int[] ele : dist ) Arrays.fill( ele , Integer.MAX_VALUE ) ;
20
21        dist[0][0] = 0 ;
22
23        int drow[] = { -1 , 0 , 1 , 0 } ;
24        int dcol[] = { 0 , 1 , 0 , -1 } ;
25
26        while( !q.isEmpty() ){
27
28            Pair curr = q.poll() ;
29            int row = curr.row ;
30            int col = curr.col ;
31            int t = curr.time ;
32
33            if( row==n-1 && col==n-1 ) return t ;
34
35            for( int i =0 ; i<4 ; i++ ){
36                
37                int nrow = row + drow[i] ;
38                int ncol = col + dcol[i] ;
39
40                if( nrow>=0 && ncol>=0 && nrow<n && ncol<n ) {
41
42                    int ntime = grid[nrow][ncol] ;
43                    int newtime = Math.max( t , ntime ) ;
44
45                    if( newtime < dist[nrow][ncol] ){
46
47                        dist[nrow][ncol] = newtime ;
48                        q.add( new Pair( nrow , ncol , newtime ) ) ;
49                        
50                    }
51                }
52            }
53        } 
54        return 0 ;
55    }
56}