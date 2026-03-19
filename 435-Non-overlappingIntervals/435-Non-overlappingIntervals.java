// Last updated: 19/3/2026, 8:05:24 pm
1class Solution {
2    public int eraseOverlapIntervals(int[][] arr) {
3        Arrays.sort( arr , (a,b)-> Integer.compare(a[1],b[1]) );
4
5        int pe = arr[0][1] ;
6
7        int c = 0 ;
8        for( int i=1 ; i<arr.length ; i++ ){
9            if( arr[i][0] < pe ){
10                c++ ;
11            }
12            else{
13                pe = arr[i][1] ;
14            }
15        }
16
17        return c ;
18    }
19}