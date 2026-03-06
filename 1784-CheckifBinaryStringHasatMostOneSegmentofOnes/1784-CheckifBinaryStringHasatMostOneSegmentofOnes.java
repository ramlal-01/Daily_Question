// Last updated: 6/3/2026, 12:22:46 pm
1class Solution {
2    public boolean checkOnesSegment(String s) {
3        int n = s.length() ;
4
5        if( n==1 && s.charAt(0)=='1') return true ;
6        if( n==2 && s.equals("10") ) return true ;
7
8        int zero = 0 , one = 0 ;
9        for( char c : s.toCharArray()){
10            if( c=='1') one++;
11            else zero++;
12        }
13        String arr[] = s.split("0") ;
14        // System.out.println( Arrays.toString(arr));
15        // if( one==1) return true; 
16
17        // for( int i =1 ;  i<n ; i++ ){
18        //     if( s.charAt(i-1)=='1' && s.charAt(i)=='1' ){
19        //         return true ;
20        //     }
21        // }
22        // return false ;
23        if( arr.length==1 ) return true ;
24        return false ;
25    }
26}