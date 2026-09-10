// Last updated: 10/9/2026, 11:40:35 am
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length ;
4        int dp[] = new int[n] ;
5
6        Arrays.fill(dp,1) ;
7
8        for( int i = 0 ; i<n ; i++ ){
9            for( int j = 0 ; j<i ; j++ ){
10                if( nums[j]<nums[i] ){
11                    dp[i] = Math.max( dp[i] , dp[j] + 1 );
12                    
13                }
14            }
15        }
16        int max = Integer.MIN_VALUE ;
17        for( int i = 0 ; i<n ; i++ ){   
18            max = Math.max( dp[i] , max ) ;
19        }
20
21        return max ;
22    }
23}