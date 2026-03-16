// Last updated: 16/3/2026, 2:50:20 pm
1class Pair{
2    int node ; 
3    int time ; 
4    Pair( int node , int time ){
5        this.time = time ;
6        this.node = node ;
7    }
8}
9class Solution {
10    public int networkDelayTime(int[][] times, int n, int k) {
11        List<List<Pair>> adj = new ArrayList<>() ;
12
13        for( int i =0 ; i<n ; i++ ){
14            adj.add( new ArrayList<>() );
15        }
16
17        for( int ele[] : times ){
18            adj.get( ele[0]-1 ).add( new Pair( ele[1]-1,ele[2]) );
19        }
20
21        PriorityQueue<Pair> pq = new PriorityQueue<>( (a,b) -> a.time-b.time ) ;
22        pq.add( new Pair(k-1 , 0 )) ;
23
24        int dist[] = new int[n] ;
25        Arrays.fill( dist , Integer.MAX_VALUE ) ;
26        dist[k-1] = 0 ;
27
28        while( !pq.isEmpty() ){
29            Pair curr  = pq.poll() ;
30            int node = curr.node ;
31            int time = curr.time ;
32
33            for( Pair nei : adj.get(node) ){
34                int nnode = nei.node ;
35                int ntime = nei.time ;
36
37                if( time+ntime < dist[nnode] ){
38                    dist[nnode] = time + ntime ;
39                    pq.add( new Pair( nnode , time+ntime ));
40                }
41            }
42        }
43
44        int max = Integer.MIN_VALUE ;
45        for( int ele : dist ){
46            if( ele==Integer.MAX_VALUE ) return -1 ;
47
48            max = Math.max( max , ele ) ;
49        }
50        return max ;
51    }
52}