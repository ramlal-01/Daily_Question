// Last updated: 18/3/2026, 11:17:26 am
1class Solution {
2    public int countPaths(int n, int[][] roads) {
3        long mod = (long)1e9+7 ;
4        List<List<long[]>> adj = new ArrayList<>() ;
5        for( int i=0 ; i<n ; i++ ){
6            adj.add( new ArrayList<>() );
7        }
8
9        for( int ele[] : roads ){
10            adj.get( ele[0] ).add( new long[]{ele[1] , ele[2]} );
11            adj.get( ele[1] ).add( new long[]{ele[0], ele[2]} );
12        }
13
14        long dist[] = new long[n] ;
15        Arrays.fill( dist , Long.MAX_VALUE );
16        dist[0] = 0 ;
17
18        long path[] = new long[n] ; 
19        path[0] = 1;
20
21        PriorityQueue<long[]> pq = new PriorityQueue<>( (a,b)-> Long.compare(a[1], b[1]) );
22        pq.add( new long[]{ 0 , 0 }) ;
23
24        while( !pq.isEmpty() ){
25            long[] curr = pq.poll() ;
26            long node = curr[0] ;
27            long dis = curr[1] ;
28
29            if( dis > dist[(int) node] ) continue ;
30
31            for( long[] nei : adj.get((int) node) ){
32                long nnode = nei[0] ;
33                long ndist = nei[1] ;
34
35                long newdist = dis + ndist ;
36
37                if( newdist < dist[(int)nnode] ){
38
39                    path[(int)nnode] = path[(int)node]  ;
40                    dist[(int)nnode] = newdist ;
41                    pq.add( new long[]{ nnode , newdist } );
42
43                }
44                else if( newdist == dist[(int)nnode] ){
45                    path[(int)nnode] =( path[ (int)nnode] + path[(int)node] )%mod ;
46                }
47            }
48        }
49        return (int) (path[n-1]%mod) ;
50    }
51}