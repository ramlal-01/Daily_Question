// Last updated: 24/9/2026, 3:32:46 pm
1class Solution {
2    public int smallestIndex(int[] nums) {
3        int n = nums.length ; 
4        for( int i = 0 ; i<n ; i++ ){
5            int no = nums[i] ;
6            int sum = 0 ;
7            while( no>0){
8                int rem = no%10 ;
9                sum+=rem ;
10                no = no/10 ;
11            }
12            if( i == sum ) return i ;
13        }
14        return -1 ;
15    }
16}