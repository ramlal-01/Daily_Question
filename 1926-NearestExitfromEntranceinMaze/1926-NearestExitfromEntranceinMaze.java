// Last updated: 7/8/2026, 12:00:34 pm
1class Pair{
2    int row ; 
3    int col ;
4    int dist ;
5    Pair( int r , int c , int d ){
6        row = r; col = c ; dist = d ;
7    }
8}
9class Solution {
10    public int nearestExit(char[][] maze, int[] entrance) {
11        int m = maze.length ;
12        int n = maze[0].length ;
13
14        int x = entrance[0] ;
15        int y = entrance[1] ;
16
17        Queue<Pair> q = new LinkedList<>() ;
18
19        q.add( new Pair(x,y,0) ) ;
20
21        int nrows[] = { -1 , 0 , 1, 0 } ;
22        int ncols[] = { 0 , 1, 0 , -1 } ;
23
24        boolean vis[][] = new boolean[m][n] ;
25        // for( boolean ele[] : vis ) Arrays.fill(ele,false) ;
26        vis[x][y] = true ;
27        while( !q.isEmpty() ){
28            Pair p = q.poll() ;
29            int row = p.row ;
30            int col = p.col ;
31            int dist = p.dist ;
32
33            System.out.println( row+" "+col) ;
34            if( (row!=x || col!=y) && ( row==0 || col==0 || row==m-1 || col==n-1 ) ){
35                return dist ;
36            }
37            for( int i = 0 ; i<4 ; i++ ){
38                int nrow = row + nrows[i];
39                int ncol = col + ncols[i];
40
41                if( nrow>=0 && ncol>=0 && nrow<m && ncol<n 
42                && maze[nrow][ncol]!='+' && !vis[nrow][ncol] ){
43        
44                    vis[nrow][ncol] = true ;
45                    q.add( new Pair(nrow,ncol,dist+1)) ;
46                }
47            }
48        }
49        return -1 ;
50    }
51}