// Last updated: 31/12/2025, 12:27:24 pm
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
4        int V = numCourses;
5        for( int i =0 ; i<V ; i++){
6            adj.add( new ArrayList<>());
7        }
8        for( int i =0 ; i<prerequisites.length ; i++){
9            adj.get( prerequisites[i][0]).add(prerequisites[i][1]);
10        }
11        
12        int indegree[] = new int[V];
13         
14        for( int i=0 ; i<V ; i++){
15            for( int ele : adj.get( i)){
16                indegree[ele]++;
17            }
18        }
19        
20        Queue<Integer> q = new LinkedList<>();
21        for(int i = 0 ; i<V ; i++){
22            if( indegree[i]==0){
23                q.add( i);
24            }
25        } 
26        int c =0;
27        while( !q.isEmpty()){
28            int node = q.peek();
29            q.poll(); 
30            c++;            
31            for( int ele : adj.get( node)){
32                indegree[ele]--;
33                
34                if( indegree[ele]==0){
35                    q.add( ele );
36                }
37            }
38        }
39        return c==V ;
40    }
41}