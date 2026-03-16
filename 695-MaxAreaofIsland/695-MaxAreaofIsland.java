// Last updated: 16/3/2026, 10:59:15 am
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int n = grid.length ;
4        int m = grid[0].length ;
5
6        boolean vis[][] = new boolean[n][m] ;
7        int max = 0 ;
8        for( int i =0 ; i<n ; i++ ){
9            for( int j = 0 ; j<m ; j++ ){
10                if( grid[i][j]==1 && !vis[i][j] ){
11                    int area = dfs( grid , vis , n , m , i , j ) ;
12                    max = Math.max( area , max );
13                }
14            }
15        }
16        return max ;
17    }
18
19    public int dfs( int[][] grid , boolean vis[][] , int n , int m , int row , int col ){
20
21        if( row<0 || col<0 || row>=n  || col>=m || 
22            grid[row][col]!=1 || vis[row][col]  ){
23            return 0;
24        }
25
26        vis[row][col] = true ;
27        int area = 1 ;
28
29        area+=dfs( grid , vis , n , m , row+1 , col );
30        area+=dfs( grid , vis , n , m , row , col+1 );
31        area+=dfs( grid , vis , n , m , row-1 , col ) ;
32        area+=dfs( grid , vis , n , m , row , col-1 ) ;
33
34        return area ;
35    }
36}