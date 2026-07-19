// Last updated: 19/7/2026, 8:09:24 pm
1class Solution {
2public:
3    string smallestSubsequence(string s) {
4        int n = s.length() ;
5        int freq[26] = {0} ;
6
7        for( char c : s ){
8            freq[c-'a']++;
9        }
10
11        bool vis[26] = {false} ;
12
13        stack<char> st ; 
14
15        for( char c : s ){
16            freq[c-'a']-- ;
17
18            if ( vis[c-'a'] ) continue ;
19
20            while( !st.empty() && st.top()>c && freq[st.top()-'a']>0 ){
21                
22                vis[st.top()-'a']=false;
23                st.pop() ;
24            }
25
26            st.push(c);
27            vis[c-'a']=true;
28        }
29        string str ="" ;
30
31        while( !st.empty() ){
32            str+=st.top();
33            st.pop();
34        }
35        reverse( str.begin(),str.end());
36        return str ;
37    }
38};
39