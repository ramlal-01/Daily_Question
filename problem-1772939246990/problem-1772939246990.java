// Last updated: 8/3/2026, 8:37:26 am
1class Solution {
2    public int smallestBalancedIndex(int[] nums) {
3        int n = nums.length ;
4        long[] arr = new long[n+1] ;
5        long mod = 100000000000000L ;
6        arr[n] = 1 ;
7        for( int i =n-1 ; i>=0 ; i-- ){
8            if( arr[i+1]>mod/nums[i]) arr[i] = mod+1;
9            else arr[i] = nums[i] * arr[i+1] ;
10        }
11
12        long sum = 0 ;
13
14        for( int i =0 ; i<n; i++ ){
15            long right = arr[i+1] ;
16            if( sum == right ){
17                return i ;
18            }
19            sum+= nums[i] ;
20        }
21        return -1 ;
22    }
23}