// Last updated: 18/2/2026, 4:13:33 pm
1class Pair{
2    int r ; 
3    int c ;
4    int o ;
5    Pair( int r , int c , int o){
6        this.r = r ;
7        this.c = c ;
8        this.o = o ;
9    }
10}
11class Solution {
12    public int orangesRotting(int[][] grid) {
13        int m = grid.length ;
14        int n = grid[0].length ;
15
16        int total = 0 ;
17
18        Queue<Pair> q = new LinkedList<>() ;
19
20        for( int i=0 ; i<m ; i++ ){
21            for( int j = 0 ; j<n ; j++ ){
22                if( grid[i][j]==2 ){
23                    q.add( new Pair(i , j , 1 ));
24                }
25                if( grid[i][j]==1 ){
26                    total++;
27                }
28            }
29        }
30
31        if( total==0 ) return 0 ;
32        int nrow[] = {-1,0,1,0};
33        int ncol[] = {0,1,0,-1};
34        while( !q.isEmpty() ){
35            Pair curr = q.poll() ;
36            int row = curr.r ;
37            int col = curr.c ;
38            int ora = curr.o ;
39
40            
41            
42            for( int i=0 ; i<4 ; i++ ){
43                int newrow = row+nrow[i];
44                int newcol = col+ncol[i];
45
46                if( newrow>=0 && newrow<m && newcol>=0 && newcol<n && grid[newrow][newcol]==1 ){
47                    total--;
48                    grid[newrow][newcol]=2 ;
49                    q.add( new Pair( newrow,newcol, ora+1 ));
50
51                    if( total == 0 ){
52                        return ora;
53                    }
54                }
55            }
56        }
57        return -1 ;
58    }
59}