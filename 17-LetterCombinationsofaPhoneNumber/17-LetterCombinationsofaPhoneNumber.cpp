// Last updated: 30/7/2026, 9:33:15 pm
1class Solution {
2public:
3    vector<string> letterCombinations(string digits) {
4        vector<string> res ;
5        vector<string> map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
6        string curr = "";
7        helper( 0 , digits , curr , res , map ) ;
8        return res ;
9    }
10
11    void helper(int ind , string &digits ,string &curr , vector<string> &res ,vector<string> &map ){
12        if( ind==digits.length() ){
13            res.push_back(curr);
14            return ;
15        }
16
17        string letters = map[digits[ind]-'0'] ;
18
19        for( char c : letters ){
20            curr+=c ;
21            helper( ind+1 , digits , curr , res , map ) ;
22            curr.pop_back();
23        }
24
25    }
26};