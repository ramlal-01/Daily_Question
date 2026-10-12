// Last updated: 12/10/2026, 12:36:27 pm
1class Solution {
2    public boolean increasingTriplet(int[] nums) {
3        int num1 = Integer.MAX_VALUE ;
4        int num2 = Integer.MAX_VALUE ;
5
6        for( int i = 0 ; i<nums.length ; i++ ){
7            int num3 = nums[i] ;
8
9            if( num3<= num1){
10                num1 = num3 ;
11            }
12            else if( num3<=num2 ){
13                num2 = num3 ;
14            }
15            else return true;
16        }
17        return false ;
18    }
19}