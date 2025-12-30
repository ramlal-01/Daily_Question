// Last updated: 30/12/2025, 12:35:41 pm
1class Solution {
2
3    public int maxAreaOfIsland(int[][] grid) {
4        int n = grid.length ;
5        int m = grid[0].length ;
6
7        boolean vis[][] = new boolean[n][m];
8
9        int max = 0 ;
10        for( int i =0  ;i<n ; i++){
11            for( int j = 0 ; j<m ; j++){
12                if( grid[i][j]==1 &&  !vis[i][j] ){
13                    int arr[] = {0};
14                    dfs( grid , vis , i , j, arr );
15                    max = Math.max( max , arr[0] );
16                }
17            }
18        }
19        return max ;
20    }
21
22    public void dfs( int[][] grid , boolean[][] vis , int row , int col , int[] arr){
23        if( row<0 || row>=grid.length || col<0 || col>=grid[0].length
24            || vis[row][col]
25            || grid[row][col]==0 ){
26            return;
27        }
28
29
30        arr[0]++;
31
32        vis[row][col] = true ;
33
34        dfs( grid , vis , row-1, col,arr);
35        dfs( grid , vis , row, col+1 , arr);
36        dfs( grid , vis , row+1 , col ,arr);
37        dfs( grid , vis , row , col-1,arr);
38
39    }
40
41
42}