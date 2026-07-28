// Last updated: 28/7/2026, 12:14:28 pm
1class Solution {
2public:
3    string smallestPalindrome(string s) {
4        int n = s.size() ;
5        vector<char> str ;
6
7        for( int i = 0 ; i<n/2 ; i++ ){
8            str.push_back(s[i]) ;
9        }
10        sort(str.begin(),str.end());
11
12        string res="" ;
13
14        for(char c : str ){
15            res+=c ;
16        }
17        if (n % 2)
18            res += s[n / 2];
19        for( int i = str.size()-1 ; i>=0 ; i-- ){
20            res+=str[i] ;
21        }
22        return res ;
23    }
24};