// Last updated: 31/7/2026, 1:51:13 pm
1class Solution {
2public:
3    int bestClosingTime(string s) {
4        int n = s.size();
5        if( n==1 ){
6            if( s[0]=='Y') return 1 ;
7            else return 0 ;
8        }
9
10        vector<int> pre(n) ;
11        vector<int> suf(n) ;
12
13        if( s[0]=='N') pre[0] = 1 ;
14        if( s[n-1]=='Y') suf[n-1]=1 ;
15
16        for( int i = 1 ; i<n ; i++ ){
17            if( s[i]=='N') pre[i] = pre[i-1]+1 ;
18            else pre[i] = pre[i-1] ;
19        }
20
21        for( int i = n-2 ; i>=0  ; i-- ){
22            if( s[i]=='Y' ) suf[i]= suf[i+1]+1 ;
23            else suf[i] = suf[i+1] ;
24        }
25        int ans = 0 ;
26        int mini = INT_MAX ;
27        int ind  = 0 ;
28        for (int i = 0; i <= n; i++) {
29            if (i == n) {
30                ans = pre[n - 1];   
31            }
32            else if (s[i] == 'N') {
33                ans = (i == 0 ? 0 : pre[i] - 1) + suf[i];
34            }
35            else {
36                ans = (i == 0 ? 0 : pre[i - 1]) + suf[i];
37            }
38
39            if (ans < mini) {
40                mini = ans;
41                ind = i;
42            }
43        }
44        return ind ;
45    }
46};