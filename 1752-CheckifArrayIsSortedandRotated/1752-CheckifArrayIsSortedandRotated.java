// Last updated: 11/12/2025, 7:35:00 pm
1class Solution {
2    public boolean check(int[] nums) {
3        int n = nums.length ;
4        int c = 0 ;
5        for( int i =0 ; i<n ; i++){
6            int j;
7            for(  j = i ; j<n+i-1 ; j++){
8                // System.out.println( nums[j%n] +" "+ nums[ (j+1)%n ]);
9                if( nums[j%n] > nums[ (j+1)%n ] ){
10                    break;
11                }
12            }
13            if( j == n+i-1 ) return true ;
14        }
15        return false ;
16    }
17}