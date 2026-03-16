// Last updated: 16/3/2026, 3:28:09 pm
1class Pair{
2    int row ; 
3    int col ;
4    int dist ;
5    Pair( int row , int col , int dist ){
6        this.row = row ;
7        this.col = col ;
8        this.dist = dist ;
9    }
10}
11class Solution {
12    public int maxDistance(int[][] grid) {
13        int n = grid.length ;
14
15        int dist[][] = new int[n][n]  ;
16
17        for( int ele[] : dist ){
18            Arrays.fill( ele , Integer.MAX_VALUE ) ;
19        }
20
21        PriorityQueue<Pair> pq = new PriorityQueue<>( (a,b)-> a.dist-b.dist ) ;
22
23        int one = 0 ;
24        int zero = 0 ;
25        for( int i =0 ; i<n ; i++ ){
26            for( int j = 0 ; j<n ; j++ ){
27                if( grid[i][j]==1 ){
28                    pq.add( new Pair( i , j , 0 ));
29                    dist[i][j] = 0 ;
30                    one++;
31                }
32                else zero++;
33            }
34        }
35
36        if( one==n*n || zero==n*n ) return -1 ;
37
38        int drow[] = { -1 , 0 , 1 , 0 } ;
39        int dcol[] = { 0 , 1 , 0 , -1 } ;
40
41        while( !pq.isEmpty() ){
42            Pair curr = pq.poll() ;
43            int row = curr.row ;
44            int col = curr.col ;
45            int dis = curr.dist ;
46
47            for( int i =0 ; i<4 ; i++ ){
48                int nrow = row+drow[i] ;
49                int ncol = col+dcol[i] ;
50
51                if(nrow>=0 && ncol>=0 && nrow<n && ncol<n && 
52                    grid[nrow][ncol]==0 && dis+1 < dist[nrow][ncol] ){
53                        dist[nrow][ncol] = dis+1 ;
54                        pq.add( new Pair( nrow , ncol , dis+1 ) );
55                    }
56            }
57        }
58
59        int max = Integer.MIN_VALUE ;
60        boolean flag = true ;
61        for( int i =0 ; i<n ; i++ ){
62            for( int j = 0 ; j<n ; j++ ){
63                flag = false ;
64                max = Math.max( max , dist[i][j] );
65            }
66        }
67
68        if(flag) return -1 ;
69
70        return max ;
71    }
72}