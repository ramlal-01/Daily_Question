// Last updated: 10/3/2026, 10:27:49 am
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        List<List<Integer>> adj = new ArrayList<>() ;
4        for( int i =0 ; i<n ;i++){
5            adj.add( new ArrayList<>() ) ;
6        }
7        for( int ele[] : edges ){
8            adj.get(ele[0]).add(ele[1]);
9            adj.get(ele[1]).add(ele[0]);
10        }
11
12        Queue<Integer> q = new LinkedList<>() ;
13        q.add(source);
14        boolean vis[] = new boolean[n] ;
15        vis[source] = true ;
16        while( !q.isEmpty()){
17            int node= q.poll() ;
18
19            if( node==destination) return true ;
20
21            for( int ele : adj.get( node ) ){
22                if( !vis[ele] ){
23                    vis[ele]= true ;
24                    q.add(ele) ;
25                }
26            }
27        }
28        return false ;
29    }
30}