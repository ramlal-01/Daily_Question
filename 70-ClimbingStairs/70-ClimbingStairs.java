// Last updated: 7/9/2026, 10:54:50 am
1class Solution {
2    public int climbStairs(int n) {
3        int arr[] = new int[n] ;
4        if( n<=2 ) return n ;
5
6        arr[0] = 1 ;
7        arr[1] = 2 ;
8
9        for( int i = 2 ; i<n ; i++ ){
10            arr[i] = arr[i-1] + arr[i-2] ;
11        }
12
13        return arr[n-1] ; 
14    }
15}