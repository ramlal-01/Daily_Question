// Last updated: 31/12/2025, 12:59:09 pm
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
4        int V = numCourses ;
5        for(int i =0 ;i<V ;i++) adj.add( new ArrayList<>() );
6        
7        int indegre[] = new int[V];
8        for( int ele[] : prerequisites ){
9            adj.get(ele[1]).add(ele[0]);
10            indegre[ele[0]]++;
11        }
12
13        Queue<Integer> que = new ArrayDeque<>();
14        for( int i =0 ; i<V ; i++){
15            if( indegre[i]==0 ){
16                que.add(i);
17            }
18        }
19        
20        int topo[] = new int[V];
21        int k =0 ;
22
23        int c = 0;
24        while( !que.isEmpty() ){
25            int node = que.poll();
26            topo[k++] = node ;
27            c++;
28            for( int ele : adj.get(node) ){
29                indegre[ele]--;
30
31                if( indegre[ele]==0){
32                    que.add( ele );
33                }
34            }
35        }
36
37        if( c<V ) return new int[0];
38        return topo ;
39    }
40}