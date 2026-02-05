// Last updated: 5/2/2026, 7:35:44 am
1class Solution {
2    public int[] constructTransformedArray(int[] nums) {
3        int n= nums.length ;
4        int res[] = new int[n];
5
6        for( int i=0 ; i<n ; i++ ){
7            
8            if( nums[i]>0 ){
9                res[i] = nums[(i+ nums[i]) % n];
10            }
11            else if( nums[i]<0 ){
12                int x = i - (Math.abs(nums[i]))%n ;
13                int y = x<0 ? ( n+x )% n : x;
14                res[i] = nums[y];
15            }
16            else res[i] = nums[i];
17        }
18        return res;
19    }
20}