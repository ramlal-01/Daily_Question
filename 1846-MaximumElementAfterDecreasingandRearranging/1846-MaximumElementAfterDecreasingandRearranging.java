// Last updated: 28/6/2026, 10:53:44 pm
1class Solution {
2    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
3        int n = arr.length ; 
4        Arrays.sort(arr) ;
5
6        if( arr[0]!=1) arr[0] = 1 ;
7
8        for( int i = 1 ; i<n ; i++ ){
9            if( (arr[i] - arr[i-1])>1  ){
10                arr[i] = arr[i-1]+1 ;
11            }
12        }
13
14        return arr[n-1] ;
15    }
16}