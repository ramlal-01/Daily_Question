// Last updated: 8/3/2026, 8:15:42 am
1class Solution {
2    public int minimumIndex(int[] capacity, int itemSize) { 
3        int n = capacity.length ;
4        int ans = 101 ;
5        int ind = -1;
6        for( int i =0 ; i<n  ;i++ ){
7            if( capacity[i]>= itemSize && capacity[i]<ans){
8                ans = capacity[i];
9                ind = i;
10            }
11        }
12
13        return ind ;
14    }
15}