// Last updated: 18/3/2026, 12:05:37 pm
1class Solution {
2    public boolean canFinish(int n, int[][] arr) {
3        List<List<Integer>> adj = new ArrayList<>() ;
4        for( int i =0 ; i<n ; i++ ) adj.add( new ArrayList<>()) ;
5
6        int ind[] = new int[n] ;
7
8        for( int ele[] : arr ){
9            adj.get(ele[0]).add(ele[1]);
10            adj.get(ele[1]).add(ele[0]);
11            ind[ele[1]]++;
12        }
13
14        Queue<Integer> q = new LinkedList<>();
15
16        for( int i=0 ; i<n ; i++ ){
17            if( ind[i]==0 ) q.add(i) ;
18        }
19
20        if( q.isEmpty()) return false ;
21
22        while(!q.isEmpty() ){
23            int node = q.poll() ;
24
25            for( int ele : adj.get(node) ){
26                ind[ele]-- ;
27
28                if( ind[ele]==0 ){
29                    q.add(ele);
30                }
31            }
32        }
33
34        for( int ele : ind ){
35            if( ele>0) return false ;
36        }
37        return true ;
38    }
39}