// Last updated: 21/9/2025, 11:38:14 pm
class Solution {
    public boolean dfs( ArrayList<ArrayList<Integer>> adj , boolean[] visited , int node, int[] count){
        visited[node] = true ;
        count[0]++;
        count[1] += adj.get(node).size();
        for( int ele : adj.get(node)){
            if(!visited[ele]){
                dfs( adj , visited , ele , count);
            } 
        }

        return false;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for( int i =0 ; i<n ; i++){
            list.add( new ArrayList<>());
        }

        for( int i = 0 ; i<edges.length ; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            list.get(u).add(v);
            list.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        int c= 0 ;
        for( int i = 0 ; i<n ; i++){
            if( !visited[i]){
                int[] count = new int[2];
                dfs(list , visited , i , count) ;

                int node = count[0];
                int edge = count[1]/2;

                int reqedge = (int)(node*(node-1))/2;
                if( edge==reqedge) c++;
            }
        }
        return c ;
    }
}