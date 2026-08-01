// Last updated: 1/8/2026, 8:13:22 pm
1class Solution {
2public:
3    int countValidPrefixes(string s) {
4        int n = s.length() ;
5
6        int c = 0 ;
7            for( int j = 0 ; j<n ; j++ ){
8                int zero = 0 ;
9                int one = 0 ;
10                for( int k = 0 ; k<=j ; k++ ){
11                    if( s[k]=='0') zero++;
12                    else one++;
13                    
14                }
15                if( abs(zero-one)<=1 ){
16                    c++;
17                }
18                
19            }
20        
21        return c ;
22    }
23};