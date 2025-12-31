// Last updated: 31/12/2025, 12:30:26 pm
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
4        int V = numCourses;
5        for( int i =0 ; i<V ; i++){
6            adj.add( new ArrayList<>());
7        }
8        int indegree[] = new int[V];
9        for( int i =0 ; i<prerequisites.length ; i++){
10            adj.get( prerequisites[i][0]).add(prerequisites[i][1]);
11            indegree[ prerequisites[i][1]]++;
12        }
13        Queue<Integer> q = new ArrayDeque<>();
14        for(int i = 0 ; i<V ; i++){
15            if( indegree[i]==0){
16                q.add( i);
17            }
18        } 
19        int c =0;
20        while( !q.isEmpty()){
21            int node = q.peek();
22            q.poll(); 
23            c++;            
24            for( int ele : adj.get( node)){
25                indegree[ele]--;
26                
27                if( indegree[ele]==0){
28                    q.add( ele );
29                }
30            }
31        }
32
33        return c==V ;
34    }
35}