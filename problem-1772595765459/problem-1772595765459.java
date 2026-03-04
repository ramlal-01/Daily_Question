// Last updated: 4/3/2026, 9:12:45 am
1class Solution {
2    public int numSpecial(int[][] mat) {
3        int n = mat.length ;
4        int m = mat[0].length ;
5
6        int cnt = 0 ;
7        for( int i =0 ; i<n; i++ ){
8            for( int j =0 ; j<m ; j++ ){
9                if( mat[i][j]==1 ){
10                    if( check( mat , i , j ) ){
11                        cnt++;
12                    }
13                }
14            }
15        }
16        return cnt ;
17    }
18    public boolean check( int[][] mat , int a , int b ){
19        
20        for( int i = 0 ; i<mat.length ; i++ ){
21            if( mat[i][b] == 1 && i!=a ){
22                return false ;
23            }
24        }
25        for( int i = 0 ; i<mat[0].length ; i++ ){
26            if( mat[a][i] == 1 && i!=b ){
27                return false ;
28            }
29        }
30        return true;
31    }
32}