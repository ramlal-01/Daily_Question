// Last updated: 27/3/2026, 11:01:15 pm
1class Solution {
2    public int rob(int[] nums) {
3        int prev1 =0 ;
4        int prev = nums[0];
5        int n = nums.length;
6        if (n == 1) return nums[0];
7        if (n == 2) return Math.max(nums[0], nums[1]);
8
9        for( int i = 1 ; i<n-1 ; i++){
10            int take = nums[i] ;
11            if( i>1 ) take+= prev1 ;
12
13            int nottake = prev ;
14            int curr = Math.max( take  , nottake);
15            prev1 = prev ;
16            prev = curr ;
17        }
18        // System.out.println(prev);
19        int second =0 ;
20        int first = nums[1];
21
22        for( int i = 2 ; i<n ; i++){
23            int take = nums[i] + second ;
24
25            int nottake = first ;
26            int curr = Math.max( take  , nottake);
27            second = first ;
28            first  = curr ;
29        }
30        // System.out.println(first);
31        return Math.max( prev , first );
32    }
33}