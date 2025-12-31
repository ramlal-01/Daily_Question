// Last updated: 31/12/2025, 12:53:48 pm
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
4        int V = numCourses;
5        for( int i =0 ; i<V ; i++){
6            adj.add( new ArrayList<>());
7        }
8        for( int i =0 ; i<prerequisites.length ; i++){
9            adj.get( prerequisites[i][1]).add(prerequisites[i][0]);
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
26        int topo[] = new int[V];
27        int c =0 ;
28        int i = 0;
29        while( !q.isEmpty()){
30            int node = q.peek();
31            q.poll();
32            topo[i++] = node ;
33            c++;
34            for( int ele : adj.get( node)){
35                indegree[ele]--;
36                
37                if( indegree[ele]==0){
38                    q.add( ele );
39                }
40            }
41        }
42
43        if( c<V ) return new int[0];
44        return topo ;
45    }
46}