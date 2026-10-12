// Last updated: 12/10/2026, 8:29:37 pm
1class Solution {
2    public void dfs(List<List<Integer>> rooms, int node ,boolean[] visited ){ 
3        visited[node] = true;
4        for( int ele : rooms.get(node)){ 
5            if(!visited[ele]) dfs( rooms ,ele,visited );
6        }  
7    }
8    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
9        List<List<Integer>> list = new ArrayList<>();  
10        boolean[] visited = new boolean[rooms.size()];
11        dfs( rooms , 0 , visited); 
12        
13        for(boolean ele : visited ){
14            if( !ele) return false;
15        }
16        return true;
17        
18    }
19}