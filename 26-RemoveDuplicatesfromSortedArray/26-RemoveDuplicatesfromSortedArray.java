// Last updated: 11/12/2025, 10:20:08 pm
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i = 0 , j=1  ;
4        int n = nums.length ;
5        while( j< n ){
6
7            if( nums[j]!=nums[i] ){
8                nums[i+1] = nums[j] ;
9                i++;
10            }
11            j++;
12        }
13
14        return i+1 ;
15    }
16}