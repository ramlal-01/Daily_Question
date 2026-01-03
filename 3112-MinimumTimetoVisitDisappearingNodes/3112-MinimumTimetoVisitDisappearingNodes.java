// Last updated: 3/1/2026, 6:52:29 am
1class Pair{
2    int n ; 
3    int d ;
4    Pair(int n , int d ){
5        this.n = n ;
6        this.d = d ;
7    }
8}
9class Solution {
10    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
11        List<List<Pair>> adj = new ArrayList<>() ;
12
13        for( int i =0 ; i<n ; i++){
14            adj.add( new ArrayList<>() );
15        }
16        for( int ele[] : edges ){
17            adj.get( ele[0]).add( new Pair(ele[1] , ele[2] ) );
18            adj.get( ele[1]).add( new Pair(ele[0] , ele[2] ) );
19        }
20
21        PriorityQueue<Pair> pq = new PriorityQueue<>( (a,b)-> a.d - b.d );
22        pq.add( new Pair( 0 , 0 ));
23
24        int dist[] = new int[n] ;
25        Arrays.fill( dist , Integer.MAX_VALUE );
26
27        dist[0] = 0 ;
28
29        while( !pq.isEmpty() ){
30            Pair curr = pq.poll() ;
31            int node = curr.n ;
32            int dis = curr.d ;
33
34            if (dis > dist[node]) continue;
35
36            if (dis >= disappear[node]) continue;
37
38            for( Pair ele : adj.get(node) ){
39                int nei = ele.n ;
40                int di = ele.d ;
41
42                int newdist = dis + di ;
43                    
44                if( newdist < disappear[nei] &&  newdist < dist[nei] ){
45                    dist[nei] = newdist ;
46                    pq.add( new Pair(nei , newdist ));
47                }
48            }
49        }
50
51        for( int i =0 ; i<n ; i++){
52            if( dist[i]==Integer.MAX_VALUE ){
53                dist[i] = -1 ;
54            }
55        }
56        return dist ;
57    }
58}