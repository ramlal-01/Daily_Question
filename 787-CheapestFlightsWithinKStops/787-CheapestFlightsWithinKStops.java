// Last updated: 17/9/2025, 5:25:04 pm
class Pair {
    int node;
    int dist;
    Pair(int n , int d) {
        node = n;
        dist = d;
    }
}

class tuple{
    int first ;
    int second ; 
    int third ;
    tuple( int s , int d, int n){
        first = s;
        second  = d ;
        third = n ;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        
        for( int i =0 ; i<n ; i++){
            adj.add( new ArrayList<>());
        }
        
        for( int i = 0 ; i<flights.length ; i++){
            int u = flights[i][0];
            int v = flights[i][1];
            int w = flights[i][2];
            adj.get(u).add(new Pair( v, w));
        }
         
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<tuple> q = new LinkedList<>();

        q.add(new tuple(0,src, 0));

        while( !q.isEmpty()){
            tuple curr = q.poll();
            int stops = curr.first;
            int node = curr.second ;
            int dis = curr.third ;

            if( stops> k) continue;
            for( Pair ele : adj.get(node)){
                int v = ele.node ;
                int wt = ele.dist;

                if( dis + wt < dist[v] && stops<=k){
                    dist[v] = dis+wt ;
                    q.add( new tuple( stops+1 , v , dist[v]));
                }
            }
        }

        if( dist[dst] == Integer.MAX_VALUE) return -1 ;

        return dist[dst];
    }
}