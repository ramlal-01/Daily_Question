// Last updated: 12/10/2026, 2:49:24 pm
1class Solution {
2    public int longestSubarray(int[] nums) {
3        int zero = 0 ;
4        int n = nums.length ;
5
6        int j = 0 ;
7        int i = 0 ;
8        int maxi = 0 ;
9        while( j<n ){
10            if( nums[j] == 0 ) zero++;
11
12            if( zero> 1 ){
13                if( nums[i]==0 ) zero--;
14                i++;
15            }
16
17            if( zero<=1) {
18                maxi = Math.max( maxi , j-i) ;
19            }
20            j++;
21        }
22        return maxi ;
23    }
24}