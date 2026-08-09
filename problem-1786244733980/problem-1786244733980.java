// Last updated: 9/8/2026, 8:35:33 am
1class Solution {
2    public long weightedSum(int[] parent, int[] nums) {
3        int n = parent.length ; 
4
5        List<List<Integer>> adj = new ArrayList<>() ;
6        for( int i = 0  ; i<n ; i++ ) adj.add( new ArrayList<>()) ;
7
8        for( int i = 1 ; i<n ;i++) adj.get(parent[i]).add(i) ;
9
10        Queue<Integer> q = new ArrayDeque<>() ;
11        q.add(0) ;
12
13        int d[] = new int[n] ;
14        d[0] = 1 ;
15        int h = 0 ;
16        while( !q.isEmpty()){
17            int node = q.poll() ;
18
19            h = Math.max( h , d[node]) ;
20
21            for( int nei : adj.get(node)){
22                d[nei] = d[node]+1 ;
23                q.add(nei) ;
24            }
25        }
26
27        long res = 0 ;
28
29        for( int i = 0 ; i<n ; i++) res+=(long) nums[i]*(h-d[i]+1) ;
30
31        return res ;
32    }
33}