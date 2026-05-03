// Last updated: 3/5/2026, 8:12:55 am
1class Solution {
2    public int[] countOppositeParity(int[] nums) {
3        int n = nums.length ;
4        int[] arr = new int[n] ;
5
6        for( int i = 0 ; i<n ; i++ ){
7            int cnt = 0 ;
8            
9            int flag = 0 ;
10            if( nums[i]%2==0 ){
11                flag = 0 ;
12            }
13            else flag = 1 ;
14            
15            for( int j= i+1 ; j<n; j++ ){
16                int f = 0 ;
17                if( nums[j]%2==0 ){
18                    f = 0 ;
19                }
20                else f = 1 ;
21                
22                if( f == 1-flag ) cnt++;
23            }
24
25            arr[i] = cnt ;
26        }
27        return arr ;
28    }
29}