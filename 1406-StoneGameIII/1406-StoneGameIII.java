// Last updated: 3/8/2026, 11:04:15 pm
1class Solution {
2    int dp[] ;
3    public String stoneGameIII(int[] arr) {
4        int n = arr.length ;
5        dp = new int[n] ;
6        Arrays.fill( dp , -1 ) ;
7        
8        int res = helper( 0 , arr ) ; 
9
10        
11
12        return res>0 ? "Alice" : ( res==0 ? "Tie" : "Bob" ) ;
13    }
14    public int helper( int ind , int[] arr ){
15        if( ind>=arr.length ) return 0 ;
16        if( dp[ind]!=-1 ) return dp[ind] ;
17
18        int res = Integer.MIN_VALUE ; 
19
20        res = Math.max( res , arr[ind] - helper( ind+1 , arr ) ) ;
21
22        if( ind+1 <arr.length )
23        res = Math.max( res , arr[ind]+arr[ind+1] - helper( ind+2 , arr ) ) ;
24
25        if( ind+2 < arr.length )
26        res = Math.max( res , arr[ind]+arr[ind+1]+arr[ind+2] - helper( ind+3 , arr ) ) ;
27
28        return dp[ind]= res ;
29    }
30}