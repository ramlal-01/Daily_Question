// Last updated: 9/8/2026, 8:23:38 am
1class Solution {
2public:
3    double minPrice(vector<int>& prices, vector<int>& d) {
4        sort( prices.begin() , prices.end() , greater<int>() ) ;
5        sort( d.begin() , d.end() , greater<int>() ) ;
6
7        int n = prices.size() ;
8        int m = d.size() ;
9        
10        double res = 0 ;
11
12         
13    
14        for( int i =0 ; i<n ; i++ ){
15            if( i<m) res+= ( prices[i] * ( 100.0-d[i]))/100.0  ;
16            else res+=prices[i] ;
17        }
18        return res ;
19    }
20};