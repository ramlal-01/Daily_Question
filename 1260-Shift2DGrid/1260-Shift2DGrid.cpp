// Last updated: 20/7/2026, 8:20:36 am
1class Solution {
2public:
3    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {
4        int n = grid.size() ;
5        int m = grid[0].size() ;
6
7        for( int i = 0 ; i<k ; i++ ){
8            shift( grid , n , m); 
9        }
10
11        return grid ;
12    }
13    void shift( vector<vector<int>>& grid, int n , int m ){
14        vector<int> temp(n);
15
16        for( int i = 0 ; i<n ; i++ ){
17            temp[i] = grid[i][m-1] ;
18        }
19
20        for( int i = n-1 ; i>=0 ; i-- ){
21            for( int j=m-2 ; j>=0 ; j-- ){
22                grid[i][j+1] = grid[i][j] ;
23            }
24        }
25
26        grid[0][0] = temp[n-1] ;
27
28        for( int i =1 ; i<n ; i++ ){
29            grid[i][0] = temp[i-1] ;
30        }
31    }
32
33};