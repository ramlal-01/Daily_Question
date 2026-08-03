// Last updated: 3/8/2026, 11:06:16 pm
1class Solution {
2    Integer dp[] ;
3    public String stoneGameIII(int[] arr) {
4        int n = arr.length ;
5        dp = new Integer[n] ; 
6
7        int res = helper( 0 , arr ) ; 
8
9        return res>0 ? "Alice" : ( res==0 ? "Tie" : "Bob" ) ;
10    }
11    public int helper( int ind , int[] arr ){
12        if( ind>=arr.length ) return 0 ;
13        if( dp[ind]!=null ) return dp[ind] ;
14
15        int res = Integer.MIN_VALUE ; 
16
17        res = Math.max( res , arr[ind] - helper( ind+1 , arr ) ) ;
18
19        if( ind+1 <arr.length )
20        res = Math.max( res , arr[ind]+arr[ind+1] - helper( ind+2 , arr ) ) ;
21
22        if( ind+2 < arr.length )
23        res = Math.max( res , arr[ind]+arr[ind+1]+arr[ind+2] - helper( ind+3 , arr ) ) ;
24
25        return dp[ind]= res ;
26    }
27}