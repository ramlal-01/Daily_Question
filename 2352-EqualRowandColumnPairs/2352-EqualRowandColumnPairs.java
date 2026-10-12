// Last updated: 12/10/2026, 3:13:04 pm
1class Solution {
2    public int equalPairs(int[][] grid) {
3        int n = grid.length;
4         
5        int count=0;
6        for( int r = 0; r<n ; r++ ){
7            for( int c = 0 ; c<n ; c++){
8                boolean flag = true;
9                for( int i = 0 ; i<n ; i++){
10                    if( grid[r][i]!=grid[i][c]){
11                        flag = false;
12                        break;
13                    }
14                }
15                if(flag){
16                    count++;
17                }
18            }
19        }
20        return count; 
21    }
22}