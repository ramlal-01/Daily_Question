// Last updated: 2/8/2026, 9:21:20 pm
1class Solution {
2public:
3    bool canReach(vector<int>& arr, int start) {
4        int n = arr.size() ;
5
6        queue< pair<int,int> > q ;
7
8        q.push( { start,arr[start] } ) ;
9
10        vector<bool> vis(n,false) ;
11        vis[start] = true ;
12
13        while( !q.empty() ){
14            int ind = q.front().first;
15            int val = q.front().second;
16            q.pop() ;
17
18            if( val==0 ) return true ;
19
20            int left = ind-val ;
21            int right = ind+val ;
22
23            if( left>=0 && left<n && !vis[left]) 
24            {
25                q.push( {left,arr[left] } ) ;
26            vis[left] = true ;
27            }
28
29            if( right<n && right>=0 && !vis[right]) 
30            {
31                q.push( {right,arr[right] } ) ; 
32                vis[right]= true ;
33            }
34
35        }
36        return false ;
37    }
38};