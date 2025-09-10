// Last updated: 10/9/2025, 4:01:50 pm
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        boolean[] visited = new boolean[V];
        int c = 0 ; 
        for( int i=0 ; i<V ; i++){
            if( !visited[i]){
                c++;
                DFS( isConnected , visited , i );
            } 
        }
        return c ;
    }

    public void DFS(int[][] isConnected , boolean[] visited , int node ){
        visited[node] = true;

        for( int i=0 ; i< isConnected.length ; i++){
            if( isConnected[node][i]==1 && !visited[i] ){
                DFS( isConnected , visited , i);
            }
        }
    }
}