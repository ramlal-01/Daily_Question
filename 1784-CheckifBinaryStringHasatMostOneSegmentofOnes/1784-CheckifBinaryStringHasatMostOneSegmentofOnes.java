// Last updated: 6/3/2026, 12:23:18 pm
1class Solution {
2    public boolean checkOnesSegment(String s) {
3        
4        String arr[] = s.split("0") ;
5        // System.out.println( Arrays.toString(arr));
6        // if( one==1) return true; 
7
8        // for( int i =1 ;  i<n ; i++ ){
9        //     if( s.charAt(i-1)=='1' && s.charAt(i)=='1' ){
10        //         return true ;
11        //     }
12        // }
13        // return false ;
14        if( arr.length==1 ) return true ;
15        return false ;
16    }
17}