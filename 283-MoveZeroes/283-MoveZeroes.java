// Last updated: 13/10/2026, 12:53:54 am
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n = nums.length ; 
4
5        int idx = -1 ;
6        for( int i = 0  ; i<n ; i++ ){
7            if( nums[i]==0 ) {
8                idx =  i ;
9                break ;
10            }
11        }
12        if( idx==-1) return ;
13        int j = idx+1 ;
14        while( j<n ){
15            if( nums[idx] != nums[j] ){
16                int temp = nums[idx] ;
17                nums[idx] = nums[j] ;
18                nums[j] = temp ;
19                idx++;
20            }
21            j++ ;
22        }
23    }
24}