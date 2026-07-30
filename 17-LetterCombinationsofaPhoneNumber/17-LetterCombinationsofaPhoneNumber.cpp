// Last updated: 30/7/2026, 9:14:25 am
1class Solution {
2public:
3    int minimumPushes(string word) {
4        int n = word.size() ;
5        if( n<=8 ) return n ;
6
7        int ans = 8 ;
8        
9        int i = 2 ;
10        n=n-8 ;
11        while( (n/8)>0 ){
12            ans += 8*i ;
13            i++ ;
14            n=n-8;
15        }
16        ans+=i*n ;
17        return ans ;
18
19    }
20};