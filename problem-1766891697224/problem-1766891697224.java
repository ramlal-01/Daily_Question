// Last updated: 28/12/2025, 8:44:57 am
1class Solution {
2    public long maximumScore(int[] nums) {
3        int n = nums.length ;
4        long prefix[] = new long[n];
5        prefix[0] = nums[0] ;
6        
7        for( int i =1 ;i<n ; i++){
8            prefix[i] = prefix[i-1]+ nums[i] ;
9        }
10        long arr[] = new long[n];
11        arr[n-1] = nums[n-1];
12
13        for( int i = n-2 ; i>=0; i--){
14            arr[i] = Math.min( arr[i+1], nums[i]);
15        }
16        long ans = Long.MIN_VALUE ;
17        for( int i =0 ; i<n-1 ; i++){
18            ans = Math.max(ans , prefix[i]-arr[i+1] );
19        }
20        return ans ;
21    }
22}