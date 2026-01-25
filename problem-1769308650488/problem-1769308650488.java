// Last updated: 25/1/2026, 8:07:30 am
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int n = nums.length; 
4
5        int ind = n-1 ;
6
7        if (n==1) return 0 ;
8        while( true ){
9            int x = nums[ind];
10            int y;
11            if((ind-1)>=0 ){
12                y=nums[ind-1];
13                
14            }
15            else break ;
16
17            if( y<x ){
18                ind--;
19            }
20            else break ;
21        }
22        return ind;
23    }
24}