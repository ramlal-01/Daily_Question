// Last updated: 11/7/2026, 12:41:22 pm
1class Solution {
2    public boolean dfs( ArrayList<ArrayList<Integer>> adj , boolean[] visited , int node, int[] count){
3        visited[node] = true ;
4        count[0]++;
5        count[1] += adj.get(node).size();
6        for( int ele : adj.get(node)){
7            if(!visited[ele]){
8                dfs( adj , visited , ele , count);
9            } 
10        }
11
12        return false;
13    }
14    public int countCompleteComponents(int n, int[][] edges) {
15        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
16        for( int i =0 ; i<n ; i++){
17            list.add( new ArrayList<>());
18        }
19
20        for( int i = 0 ; i<edges.length ; i++){
21            int u = edges[i][0];
22            int v = edges[i][1];
23
24            list.get(u).add(v);
25            list.get(v).add(u);
26        }
27
28        boolean[] visited = new boolean[n];
29        int c= 0 ;
30        for( int i = 0 ; i<n ; i++){
31            if( !visited[i]){
32                int[] count = new int[2];
33                dfs(list , visited , i , count) ;
34
35                int node = count[0];
36                int edge = count[1]/2;
37
38                int reqedge = (int)(node*(node-1))/2;
39                if( edge==reqedge) c++;
40            }
41        }
42        return c ;
43    }
44}