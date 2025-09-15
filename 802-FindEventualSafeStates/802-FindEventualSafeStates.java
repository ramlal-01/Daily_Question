// Last updated: 15/9/2025, 11:39:29 pm
class Solution { 
    public List<Integer> eventualSafeNodes(int[][] graph) {  
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = graph.length;
        for( int i =0 ; i<V ; i++){
            adj.add( new ArrayList<>());
        }    
        int indegree[] = new int[V];
         
        for( int i=0 ; i<V ; i++){
            for( int ele : graph[i]){
                adj.get( ele).add(i);
                indegree[i]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i<V ; i++){
            if( indegree[i]==0){
                q.add( i);
            }
        }
        ArrayList<Integer> topo = new ArrayList<>();
       
        while( !q.isEmpty()){
            int node = q.peek();
            q.poll();
            topo.add(node);
            
            for( int ele : adj.get( node)){
                indegree[ele]--;
                
                if( indegree[ele]==0){
                    q.add( ele );
                }
            }
        }
        Collections.sort(topo);
        return topo ;
    }
}