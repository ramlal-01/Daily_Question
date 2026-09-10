// Last updated: 10/9/2026, 12:51:25 pm
1class Solution {
2    public int minimumMountainRemovals(int[] nums) {
3        int n = nums.length ;
4
5        int left[] = lis( nums ) ;
6        int right[] = revlis( nums ) ;
7
8        int ans = Integer.MAX_VALUE ;
9        for( int i = 0 ; i<n ; i++ ){
10            if( left[i]!=1 && right[i]!=1 ){
11                ans = Math.min( ans , n - ( left[i]+right[i]-1 ) ) ;
12            }
13        }
14        return ans ;
15    }
16
17    public int[] lis(int nums[] ) {
18        int n = nums.length ;
19        int dp[] = new int[n] ;
20
21        Arrays.fill(dp,1) ;
22
23        for( int i = 0 ; i<n ; i++ ){
24            for( int j = 0 ; j<i ; j++ ){
25                if( nums[j]<nums[i] ){
26                    dp[i] = Math.max( dp[i] , dp[j] + 1 );
27                    
28                }
29            }
30        }
31        return dp ;
32    }
33    public int[] revlis(int nums[] ) {
34        int n = nums.length ;
35        int dp[] = new int[n] ;
36
37        Arrays.fill(dp,1) ;
38
39        for( int i = n-1 ; i>=0 ; i-- ){
40            for( int j = n-1 ; j>=i ; j-- ){
41                if( nums[j]<nums[i] ){
42                    dp[i] = Math.max( dp[i] , dp[j] + 1 );
43                    
44                }
45            }
46        }
47        return dp ;
48    }
49}