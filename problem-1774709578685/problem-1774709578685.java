// Last updated: 28/3/2026, 8:22:58 pm
1class Solution {
2    public int minCost(int[][] grid) {
3        int n = grid.length ;
4        int m = grid[0].length ;
5
6        boolean[][][] dp = new boolean[n][m][1024] ;
7        dp[0][0][grid[0][0]] = true ;
8        
9        int i =0 ;
10        while( i<n ){
11            int j = 0 ;
12            while(j<m) {
13                int k = 0 ;
14                while( k<1024) {
15                    if( !dp[i][j][k]){ k++ ;continue ;}
16
17                    if( i+1 < n ){
18                        dp[i+1][j][k^grid[i+1][j]] = true ;
19                    }
20                    if( j+1 < m ){
21                        dp[i][j+1][k^grid[i][j+1]] = true ;
22                    }
23                    k++;
24                }
25                j++;
26            }
27            i++;
28        }
29        for( int x =0 ; x<1024 ; x++){
30            if( dp[n-1][m-1][x]) return x ;
31        }
32        return -1 ;
33    }
34}