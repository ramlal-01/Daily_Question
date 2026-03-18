// Last updated: 18/3/2026, 12:14:03 pm
1class Solution {
2    public int[] findOrder(int n, int[][] arr ) {
3        List<List<Integer>> adj = new ArrayList<>() ;
4        for( int i =0 ; i<n ; i++ ) adj.add( new ArrayList<>()) ;
5
6        int ind[] = new int[n] ;
7
8        for( int ele[] : arr ){
9            adj.get(ele[0]).add(ele[1]);
10            adj.get(ele[1]).add(ele[0]);
11            ind[ele[0]]++;
12        }
13
14        Queue<Integer> q = new LinkedList<>();
15
16        for( int i=0 ; i<n ; i++ ){
17            if( ind[i]==0 ) q.add(i) ;
18        }
19
20        if( q.isEmpty()) return new int[]{} ;
21
22        int topo[] = new int[n];
23        int k = 0 ;
24        while(!q.isEmpty() ){
25            int node = q.poll() ;
26            topo[k++] = node ;
27            for( int ele : adj.get(node) ){
28                ind[ele]-- ;
29
30                if( ind[ele]==0 ){
31                    q.add(ele);
32                }
33            }
34        }
35
36        for( int ele : ind ){
37            if( ele>0) return new int[]{} ;
38        }
39        return topo ;
40    }
41}