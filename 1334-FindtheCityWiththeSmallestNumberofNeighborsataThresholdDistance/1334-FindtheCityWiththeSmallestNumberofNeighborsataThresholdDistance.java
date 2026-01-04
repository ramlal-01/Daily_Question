// Last updated: 4/1/2026, 12:43:13 pm
1class Solution {
2    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
3        int grid[][] = new int[n][n];
4
5        for( int ele[] : grid ){
6            Arrays.fill( ele , Integer.MAX_VALUE );
7        }
8
9        for( int ele[] : edges ){
10            grid[ele[0]][ele[1]] = ele[2];
11            grid[ele[1]][ele[0]] = ele[2];
12        }
13
14        for( int i =0 ; i<n ; i++){
15            for( int j =0 ; j<n ; j++){
16                if( i==j ) grid[i][j] = 0 ;
17            }
18        }
19
20        for( int k = 0 ; k<n ; k++){
21            for( int i =0 ; i<n ; i++){
22                for( int j = 0 ; j<n ; j++){
23                    if( grid[i][k] == Integer.MAX_VALUE || grid[j][k] == Integer.MAX_VALUE) continue ;
24
25                    grid[i][j] = Math.min( grid[i][j] , grid[i][k] + grid[k][j] );
26                }
27            }
28        }
29
30        int cntcity = n ;
31        int city = -1 ;
32
33        for( int i =0 ; i<n ; i++){
34            int c = 0 ;
35            for( int j =0 ; j<n ; j++){
36                if( grid[i][j]<=distanceThreshold){
37                    c++;
38                }
39            }
40
41            if( c<=cntcity){
42                cntcity = c ;
43                city = i ;
44            }
45        }
46        return city ;
47    }
48}