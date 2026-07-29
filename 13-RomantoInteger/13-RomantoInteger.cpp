// Last updated: 29/7/2026, 10:38:30 pm
1class Solution {
2public:
3    int romanToInt(string s) {
4        unordered_map<char,int> map = { {'I',1} , {'V',5} , {'X',10} , {'L',50} , {'C',100},{'D',500} , {'M',1000} } ;
5
6        int prev = 0 ;
7        int ans = 0 ;
8        for( int i = s.length()-1 ; i>=0 ; i-- ){
9            int curr = map[s[i]] ;
10
11            if( curr<prev ){
12                ans = ans - curr ;
13            }
14            else {
15                ans = ans + curr ;
16            }
17            cout << ans << " " ;
18            prev = curr ;
19        }
20        return ans ;
21    }
22};