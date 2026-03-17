// Last updated: 17/3/2026, 10:41:13 am
1class Pair{
2    int node ;
3    int dist ; 
4    Pair( int node , int dist ){
5        this.node = node ;
6        this.dist = dist ;
7    }
8}
9class tuple{
10    int first ;
11    int second ;
12    int third ;
13    tuple( int first , int second , int third ){
14        this.first = first ;
15        this.second = second ;
16        this.third = third ;
17    }
18}
19class Solution {
20    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
21        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
22        for( int i =0 ; i<n ; i++){
23            adj.add( new ArrayList<>());
24        }
25        
26        for( int i = 0 ; i<flights.length ; i++){
27            int u = flights[i][0];
28            int v = flights[i][1];
29            int w = flights[i][2];
30            adj.get(u).add(new Pair( v, w));
31        }
32         
33        int[] dist = new int[n];
34        Arrays.fill(dist, Integer.MAX_VALUE);
35        dist[src] = 0;
36
37        Queue<tuple> q = new LinkedList<>();
38
39        q.add(new tuple(0,src, 0));
40
41        while( !q.isEmpty() ){
42            tuple curr = q.poll() ;
43            int stops = curr.first ;
44            int node  = curr.second ;
45            int dis   = curr.third ; 
46
47            if( stops > k ) continue ;
48
49            for( Pair nei : adj.get(node) ){
50                int nnode = nei.node ;
51                int ndist = nei.dist ;
52
53                int newdist = dis + ndist ;
54
55                if( newdist < dist[nnode] ){
56                    dist[nnode] = newdist ;
57                    q.add( new tuple( stops+1 , nnode , newdist ) );
58                }
59            }
60        }
61
62        if( dist[dst]==Integer.MAX_VALUE ) return -1 ;
63
64        return dist[dst] ;
65    }
66}