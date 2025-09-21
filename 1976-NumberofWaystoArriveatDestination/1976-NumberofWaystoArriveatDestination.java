// Last updated: 21/9/2025, 8:41:43 pm
class Pair{
    int first ;
    long second ; 
    Pair( int f , long s){
        first = f ;
        second= s ;
    }
}
class Solution {
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for( int i =0 ; i< n ; i++) adj.add( new ArrayList<>());

        for( int i =0 ; i<roads.length ; i++){
            int u = roads[i][0];
            int v = roads[i][1];
            int w = roads[i][2];

            adj.get(u).add( new Pair(v,w));
            adj.get(v).add( new Pair(u,w));
        }

        PriorityQueue<Pair> q = new PriorityQueue<>( (a,b) -> Long.compare(a.second, b.second));

        q.add( new Pair( 0 , 0));

        long dist[] = new long[n];
        int ways[] = new int[n];

        Arrays.fill(dist, Long.MAX_VALUE);

        Arrays.fill( ways , 0);

        ways[0] = 1 ;
        dist[0] = 0 ;

        int mod = (int)(1e9 + 7);
        while( !q.isEmpty()){
            int node = q.peek().first ;
            long time = q.peek().second ;
            q.poll();

            for( Pair ele : adj.get(node) ){
                int nnode = ele.first ;
                long ntime = ele.second ;

                long newDist = time + ntime;
                if (newDist < dist[nnode]) {
                    dist[nnode] = newDist;
                    q.add(new Pair(nnode, newDist));
                    ways[nnode] = ways[node];
                } else if (newDist == dist[nnode]) {
                    ways[nnode] = (ways[nnode] + ways[node]) % mod;
                }

            }
        }

        return ways[n-1];
    }
}