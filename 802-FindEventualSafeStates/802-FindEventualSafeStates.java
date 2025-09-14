// Last updated: 14/9/2025, 5:40:02 pm
class Solution {
    public boolean dfs(int[][] graph , boolean[] visited , int node ,int[] path ,  int check[]  ){
        visited[node] = true ;
        path[node]= 1;
        check[node]= 0;
        for( int ele : graph[node]){
            if( !visited[ele]){
                if( dfs( graph , visited , ele , path , check)) return true;
            }
            
            else if( path[ele]==1){
                return true;
            }
        }
        path[node]=0;
        check[node]= 1;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) { 
        int V = graph.length;
        boolean[] visited = new boolean[V];
        int[] path = new int[V];
        int[] check = new int[V];
        
        for( int i=0 ; i<V ; i++){
            if( !visited[i]){
                dfs( graph , visited , i , path , check);
            }
        }

        List<Integer> list = new ArrayList<>();
        for( int i = 0 ; i<V  ;i++){
            if( check[i]==1 ) list.add( i);
        }
        return list ;
    }
}