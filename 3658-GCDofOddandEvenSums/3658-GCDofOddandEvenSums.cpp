// Last updated: 15/7/2026, 11:14:24 pm
1class Solution {
2public:
3    int gcdOfOddEvenSums(int n) {
4        int odd = 0 ;
5        int even = 0 ;
6
7        int k = 1 ;
8        int a = 2 ;
9        for( int i=1 ; i<=n ; i++ ){
10            even+= k ;
11            odd+= a ;
12            k+=2 ;
13            a+=2 ;
14        }
15        int ans = 1 ;
16        for( int i = 1 ; i<= min(even,odd) ; i++ ){
17            if( even%i==0 && odd%i==0 ){
18                ans= i ;
19            }
20        }
21        return ans ;
22    }
23};