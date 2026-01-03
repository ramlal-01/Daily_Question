// Last updated: 3/1/2026, 7:15:10 am
1class Pair {
2    int node;
3    int dist;
4    Pair(int n , int d) {
5        node = n;
6        dist = d;
7    }
8}
9class Solution {
10    public int networkDelayTime(int[][] times, int n, int k) {
11        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
12        int V = n+1 ;
13        for( int i =0 ; i<V ; i++){
14            adj.add( new ArrayList<>());
15        }
16        
17        for( int i = 0 ; i<times.length ; i++){
18            int u = times[i][0];
19            int v = times[i][1];
20            int w = times[i][2];
21            adj.get(u).add(new Pair(v, w));
22        }
23         
24        int[] dist = new int[V];
25        Arrays.fill(dist, Integer.MAX_VALUE);
26        dist[k] = 0;
27 
28        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> a.dist - b.dist);
29        q.add(new Pair(k, 0));
30
31        while (!q.isEmpty()) {
32            Pair curr = q.poll();
33            int u = curr.node;
34            int d = curr.dist;
35
36            if (d > dist[u]) continue;  
37
38            for (Pair edge : adj.get(u)) {
39                int v = edge.node;
40                int wt = edge.dist;
41                int newdist = d + wt ;
42                if (newdist  < dist[v]) {
43                    dist[v] = newdist ;
44                    q.add(new Pair( v, newdist ));
45                }
46            }
47        }
48        int max = Integer.MIN_VALUE ;
49        for (int i=1 ; i<V;i++) {
50            if (dist[i] == Integer.MAX_VALUE) {
51                return -1;  
52            }
53            max = Math.max(dist[i], max );
54        }
55        return max;
56    }
57}