// Last updated: 14/9/2026, 1:04:04 pm
1class Solution {
2    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
3        int x1 = rec1[0] ;
4        int y1 = rec1[1] ;
5        int x2 = rec1[2] ;
6        int y2 = rec1[3] ;
7    
8
9        int a1 = rec2[0] ;
10        int b1 = rec2[1] ;
11        int a2 = rec2[2] ;
12        int b2 = rec2[3] ;
13       
14
15        if( a1>=x2 || x1>=a2 || b1>=y2 || y1>=b2){
16            return false ;
17        }
18        return true;
19    }
20}