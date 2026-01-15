// Last updated: 15/1/2026, 11:07:53 am
1class Solution {
2    public int maxProfit(int[] prices) {
3        int mini = prices[0] ;
4        int max = 0 ;
5
6        for( int i =1 ; i<prices.length ; i++){
7            int profit = prices[i] - mini ;
8            max = Math.max( profit , max );
9            mini = Math.min( mini ,prices[i] );
10        }
11        return max ;
12    }
13}