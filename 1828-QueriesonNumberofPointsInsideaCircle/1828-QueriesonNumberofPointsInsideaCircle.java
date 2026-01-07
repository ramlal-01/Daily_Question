// Last updated: 7/1/2026, 7:33:37 am
1class Solution {
2    public int[] countPoints(int[][] points, int[][] queries) {
3        int arr[] = new int[queries.length];
4        int i = 0 ;
5        for( int ele[] : queries ){
6            int x1 = ele[0] ;
7            int y1 = ele[1] ;
8            int r  = ele[2] ;
9            int c= 0 ;
10            for( int curr[] : points ){
11                int x2 = x1 - curr[0] ;
12                int y2 = y1 - curr[1] ;
13                
14                if( (x2*x2 + y2*y2 ) <= r*r ){
15                    c++;
16                }
17            }
18            arr[i++] = c;
19        }
20        return arr; 
21    }
22}