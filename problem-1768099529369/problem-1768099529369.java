// Last updated: 11/1/2026, 8:15:29 am
1class Solution {
2    public int centeredSubarrays(int[] nums) {
3        int n = nums.length ;
4        int c = 0 ;
5        for( int i=0 ; i<n ; i++){
6            for( int j =i ;j<n ;j++){
7                int sum = 0 ;
8                for( int k = i ; k<=j ; k++ ){
9                    sum+= nums[k];
10                }
11                for(  int k = i ; k<=j ; k++){
12                    if( nums[k]==sum){
13                        c++;
14                        break;
15                    }
16                }
17            }
18        }
19        return c ;
20    }
21}