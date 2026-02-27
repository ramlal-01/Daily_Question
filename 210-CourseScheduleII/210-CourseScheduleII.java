// Last updated: 28/2/2026, 1:18:08 am
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
12        Queue<Integer> que = new ArrayDeque<>();
13        for( int i =0 ; i<V ; i++){
14            if( indegre[i]==0 ){
15                que.add(i);
16            }
17        }
18        
19        int topo[] = new int[V];
20        int k =0 ;
21
22        int c = 0;
23        while( !que.isEmpty() ){
24            int node = que.poll();
25            topo[k++] = node ;
26            c++;
27            for( int ele : adj.get(node) ){
28                indegre[ele]--;
29
30                if( indegre[ele]==0){
31                    que.add( ele );
32                }
33            }
34        }
35
36        if( c<V ) return new int[0];
37        return topo ;
38    }
39}