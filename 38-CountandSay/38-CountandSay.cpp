// Last updated: 28/7/2026, 10:04:06 pm
1class Solution {
2public:
3    string countAndSay(int n) {
4        if( n==1 ) return "1" ;
5        string res = "1" ;
6        vector<pair<char,int>> map ;
7        for( int i = 0 ; i<n-1 ; i++ ){
8            map.clear() ;
9            mapping(res,map) ;
10            res = gen( map ) ;
11        }
12        return res ;
13    }
14    void mapping( string s , vector<pair<char,int>> &map ){
15        int cnt = 1 ;
16        for( int i = 1 ; i<s.size() ; i++ ){
17            if( s[i] == s[i-1] ){
18                cnt++;
19            }
20            else{
21                map.push_back( {s[i-1],cnt} ) ;
22                cnt = 1 ;
23            }
24        }
25        map.push_back( {s[s.size()-1] , cnt } ) ;
26    }
27    string gen( vector<pair<char,int>> &map ){
28        string res = "" ;
29        for( auto ele : map ){
30            res+=to_string(ele.second);
31            res+=ele.first;
32        }
33        return res ;
34    }
35};