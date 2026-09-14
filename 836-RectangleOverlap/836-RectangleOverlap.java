// Last updated: 14/9/2026, 1:49:00 pm
1class Solution {
2    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
3        int rect1[] = { ax1,ay1,ax2,ay2} ;
4        int rect2[] = { bx1,by1,bx2,by2} ;
5
6        
7
8        int x1 = Math.max( ax1, bx1 ) ;
9        int y1 = Math.max( ay1 , by1 ) ;
10
11        int x2 = Math.min( ax2,bx2 ) ;
12        int y2 = Math.min( ay2,by2) ;
13
14        int area = Math.abs(x2-x1) * Math.abs( y2-y1) ;
15        int area1 = Math.abs(ax2-ax1) * Math.abs(ay2-ay1) ;
16        int area2 = Math.abs(bx2-bx1) * Math.abs(by2-by1) ;
17
18        if( !helper(rect1,rect2) ) return area1+area2 ;
19
20        return area1+area2 - area ;
21    }
22
23    public boolean helper(int[] rec1, int[] rec2) {
24        int x1 = rec1[0] ;
25        int y1 = rec1[1] ;
26        int x2 = rec1[2] ;
27        int y2 = rec1[3] ;
28    
29
30        int a1 = rec2[0] ;
31        int b1 = rec2[1] ;
32        int a2 = rec2[2] ;
33        int b2 = rec2[3] ;
34       
35
36        if( a1>=x2 || x1>=a2 || b1>=y2 || y1>=b2){
37            return false ;
38        }
39        return true;
40    }
41}