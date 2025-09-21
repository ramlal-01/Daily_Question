// Last updated: 22/9/2025, 12:05:11 am
class Solution {
    public void dfs(List<List<Integer>> rooms, int node ,boolean[] visited ){ 
        visited[node] = true;
        for( int ele : rooms.get(node)){ 
            if(!visited[ele]) dfs( rooms ,ele,visited );
        }  
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<List<Integer>> list = new ArrayList<>();  
        boolean[] visited = new boolean[rooms.size()];
        dfs( rooms , 0 , visited); 
        
        for(boolean ele : visited ){
            if( !ele) return false;
        }
        return true;
        
    }
}