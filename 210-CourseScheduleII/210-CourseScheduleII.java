// Last updated: 14/9/2025, 11:45:28 pm
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = numCourses;
        for( int i =0 ; i<V ; i++){
            adj.add( new ArrayList<>());
        }
        for( int i =0 ; i<prerequisites.length ; i++){
            adj.get( prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        int indegree[] = new int[V];
         
        for( int i=0 ; i<V ; i++){
            for( int ele : adj.get( i)){
                indegree[ele]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i<V ; i++){
            if( indegree[i]==0){
                q.add( i);
            }
        }
        int topo[] = new int[V];
        int c =0 ;
        int i = 0;
        while( !q.isEmpty()){
            int node = q.peek();
            q.poll();
            topo[i++] = node ;
            c++;
            for( int ele : adj.get( node)){
                indegree[ele]--;
                
                if( indegree[ele]==0){
                    q.add( ele );
                }
            }
        }

        if( c<V ) return new int[0];
        return topo ;
    }
}