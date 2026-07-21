// Last updated: 21/7/2026, 2:54:39 pm
1class Solution {
2public:
3    int maxActiveSectionsAfterTrade(string s) {
4        int ones = 0 ;
5        for( char c : s ){
6            if( c=='1' ) ones++ ;
7        }
8
9        s = "1"+s+"1" ;
10        
11        vector<char> type ;
12        vector<int> len ;
13
14        int n = s.size() ;
15        int count = 1 ; 
16        for( int i = 1 ; i<n ; i++ ){
17            if( s[i]==s[i-1]) count++;
18            else{
19                type.push_back(s[i-1]);
20                len.push_back(count) ;
21                count=1 ;
22            }
23        }
24
25        type.push_back(s.back());
26        len.push_back(count);
27
28        int ans = ones;
29
30        for (int i = 1; i < type.size() - 1; i++) {
31
32            if (type[i] == '1' &&
33                type[i - 1] == '0' &&
34                type[i + 1] == '0') {
35
36                int gain = len[i - 1] + len[i + 1];
37                ans = max(ans, ones + gain);
38            }
39        }
40
41        return ans;
42    }
43};