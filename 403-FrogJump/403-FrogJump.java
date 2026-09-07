// Last updated: 7/9/2026, 12:43:37 pm
1class Solution {
2    Boolean dp[][] ;
3    public boolean canCross(int[] stones) {
4        int n = stones.length ;
5        if( stones[1]!=stones[0]+1 ) return false ;
6
7        dp = new Boolean[n][2000] ;
8
9        return helper( 1 , 1 , stones ) ;
10    }
11
12    public boolean helper( int k , int ind , int[] stones ){
13        if( ind==stones.length-1 ){
14            return true ;
15        }
16
17        if( dp[ind][k]!=null ) return dp[ind][k] ;
18
19        int prev = possible( stones[ind] + k - 1 , ind , stones )  ;
20        int first = possible( stones[ind] + k , ind , stones )  ;
21        int second = possible( stones[ind] + k + 1 , ind , stones ) ;
22        
23        if( prev!= -1 ){
24            if ( helper( k-1 , prev , stones ) ) return dp[ind][k-1] =true ;
25        }
26
27        if( first!= -1 ){
28            if ( helper( k , first , stones ) ) return dp[ind][k] =true ;
29        }
30
31        if( second!=-1 ){
32            if( helper( k+1 , second , stones ) ) return dp[ind][k+1] =true ;
33        }
34
35        return dp[ind][k] = false ;
36    }
37
38    public int possible( int val , int ind , int[] stones ){
39        int n = stones.length ;
40       
41        for( int i = ind+1 ; i<n ; i++){
42            if( stones[i]==val ){
43                return i ;
44            }
45        }
46        return -1 ; 
47    }
48}