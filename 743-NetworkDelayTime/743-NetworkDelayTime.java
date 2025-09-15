// Last updated: 15/9/2025, 4:43:41 pm
class Pair {
    int node;
    int dist;
    Pair(int n , int d) {
        node = n;
        dist = d;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        int V = n ;
        for( int i =0 ; i<V ; i++){
            adj.add( new ArrayList<>());
        }
        
        for( int i = 0 ; i<times.length ; i++){
            int u = times[i][0];
            int v = times[i][1];
            int w = times[i][2];
            adj.get(u-1).add(new Pair( v-1, w));
        }
         
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k-1] = 0;
 
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        q.add(new Pair(k-1, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int u = curr.node;
            int d = curr.dist;

            // if (d > dist[u]) continue;  

            for (Pair edge : adj.get(u)) {
                int v = edge.node;
                int wt = edge.dist;
                if (dist[u]+wt<dist[v]) {
                    dist[v]=dist[u]+wt;
                    q.add(new Pair(v, dist[v]));
                }
            }
        }

        int min = Integer.MIN_VALUE ;
        for (int ele : dist) {
            if (ele == Integer.MAX_VALUE) {
                return -1;  // unreachable node
            }
            min = Math.max(ele, min);
        }
        return min;
    }
}