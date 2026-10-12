// Last updated: 12/10/2026, 1:32:44 pm
1class Solution {
2    public int maxArea(int[] height) {
3        int n = height.length ;
4
5        int i = 0 ; 
6        int j = n-1 ;
7
8        int maxi =  0 ;
9        while( i<j ){
10            int width = j-i;
11            int hgt = Math.min( height[i] , height[j] );
12            int area = width*hgt ;
13            maxi = Math.max( maxi , area ) ;
14
15            if( height[i] < height[j] ){
16                i++;
17            }
18            else j--;
19        }
20        return maxi ;
21    }
22}