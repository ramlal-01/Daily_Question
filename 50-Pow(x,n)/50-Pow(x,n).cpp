// Last updated: 20/7/2026, 10:39:21 pm
1class Solution {
2public:
3    double myPow(double x, int n) {
4        long long N = n ;
5
6        if( N<0 ){
7            x = 1/x ;
8            N = -N ; 
9        }
10
11        double ans = 1.0 ;
12        while( N>0 ){
13            if( (N&1)==1 ){
14                ans = ans*x ;
15            }
16            x*=x ;
17            N= N>>1 ;
18        }
19        return ans ;
20    }
21};