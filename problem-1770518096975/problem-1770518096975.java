// Last updated: 8/2/2026, 8:04:56 am
1class Solution {
2    public int dominantIndices(int[] nums) {
3        int n = nums.length ;
4        int arr[] = new int[n];
5
6        arr[n-1] = nums[n-1] ;
7
8        int sum = nums[n-1 ];
9
10        for( int i = n-2 ; i>=0 ; i-- ){
11            sum+= nums[i] ;
12            arr[i] = sum/(n-i) ;
13        }
14        int c =0;
15        for( int i = 0  ; i<n-1 ; i++ ){
16            if( nums[i] > arr[i+1] ){
17                c++;
18            }
19        }
20
21        return c;
22    }
23}