// Last updated: 10/9/2026, 2:00:42 pm
1class Solution {
2    Integer dp[][] ;
3
4    public int maxSumDivThree(int[] nums) {
5        int n = nums.length ;
6        dp = new Integer[n][3] ;
7
8        return helper( n-1 , nums , 0 ) ;
9        
10    }
11
12    public int helper( int ind  , int[] nums , int rem ){
13        if( ind<0 ){
14            return rem==0 ? 0 : Integer.MIN_VALUE ;
15        }
16
17        if( dp[ind][rem]!=null ) return dp[ind][rem] ;
18
19        int newRem = ( nums[ind]+rem )%3  ; 
20        int take = helper( ind-1 , nums , newRem )  ;
21
22        take+= nums[ind] ;
23        int skip = helper( ind-1 , nums , rem ) ;
24
25        return dp[ind][rem] = Math.max(take,skip);
26    }
27}