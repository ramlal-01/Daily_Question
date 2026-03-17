// Last updated: 17/3/2026, 4:46:25 pm
1class Solution {
2    public int minCost(int[][] grid) {
3        int m = grid.length ;
4        int n = grid[0].length ;
5
6        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b)-> a[2]-b[2] );
7
8        pq.add( new int[]{0,0,0} );
9
10        int dist[][] = new int[m][n] ;
11        for( int ele[] : dist ) Arrays.fill( ele , Integer.MAX_VALUE ) ;
12
13        dist[0][0] = 0 ;
14
15        int drow[] = {0, 0, 1, -1};   
16        int dcol[] = {1, -1, 0, 0};
17
18        while( !pq.isEmpty() ){
19            int curr[] = pq.poll() ;
20            
21            int row = curr[0] ;
22            int col = curr[1] ;
23            int cost = curr[2] ;
24
25            if( row==m-1 && col==n-1 ) return cost ;
26            for( int i = 0  ; i<4 ; i++ ){
27                int nr = row+drow[i] ;
28                int nc = col+dcol[i] ;
29
30                if( nr>=0 && nc>=0 && nr<m && nc<n ){
31                    
32                    int newcost = cost ;
33
34                    if( grid[row][col]!= i+1 ) newcost = cost+1 ;
35
36                    if( newcost < dist[nr][nc] ){
37                        dist[nr][nc] = newcost ;
38                        pq.add( new int[]{ nr , nc , newcost });
39                    }
40                }
41            }
42        }
43        return -1 ;
44    }
45}