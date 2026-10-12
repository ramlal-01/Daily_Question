// Last updated: 13/10/2026, 12:47:08 am
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i = 0 ; 
4        int j = 1 ;
5        int n = nums.length ;
6        while( j<n ){
7            if( nums[i]!=nums[j] ){
8                nums[i+1] = nums[j] ;
9                i++;
10            }
11            j++;
12        }
13        return i + 1 ;
14    }
15}