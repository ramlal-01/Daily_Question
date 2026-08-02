// Last updated: 2/8/2026, 10:52:54 pm
1class Solution {
2public:
3    int minJumps(vector<int>& arr) {
4        int n = arr.size() ;
5
6        unordered_map<int , vector<int>> map ;
7
8        for( int i = 0 ; i<n ; i++ ){
9            map[arr[i]].push_back(i);
10                
11        }
12
13        queue<pair<int,int>> q ;
14        q.push( { 0 , 0 } ) ;
15
16        vector<bool> vis(n,false) ;
17        vis[0] = true ;
18
19        while( !q.empty() ){
20            int ind = q.front().first ;
21            int val = q.front().second ;
22            q.pop() ;
23
24            if( ind==n-1 ) return val ;
25
26            if( ind+1 < n && !vis[ind+1] ){
27                q.push( {ind+1 , val+1 } ) ;
28                vis[ind+1] = true;
29            }
30            if( ind-1 >= 0 && !vis[ind-1] ){
31                q.push( {ind-1 , val+1 } ) ;
32                vis[ind-1] = true ;
33            }
34            for( int nei : map[arr[ind]] ){
35                if( !vis[nei] ){
36                    q.push( {nei , val+1} );
37                    vis[nei] = true ;
38                }
39            }
40            map[arr[ind]].clear() ;
41        }
42        return -1 ;
43    }
44};