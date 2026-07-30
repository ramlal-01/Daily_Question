// Last updated: 30/7/2026, 10:48:45 pm
1class Solution {
2public:
3    int minimumPushes(string word) {
4        int n = word.size() ;
5
6        unordered_map<char,int> mp ;
7
8        for( char c : word ){
9            mp[c]++;
10        }
11
12        vector<pair<char, int>> freq(mp.begin(), mp.end());
13
14        sort(freq.begin(), freq.end(), [](auto &a, auto &b) {
15            return a.second > b.second;   
16        });
17
18        int ans = 0;
19
20        for (int i=0; i<freq.size(); i++) {
21            int cost=i/8+1;      
22            ans+=freq[i].second*cost;
23        }
24
25        return ans;
26    }
27};