// Last updated: 25/1/2026, 9:03:03 am
1class Solution {
2    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
3        List<List<Integer>> adj = new ArrayList<>();
4        for( int i =0;i<n ;i++){
5            adj.add( new ArrayList<>() );
6        }
7
8        for( int ele[] : edges ){
9            int u = ele[0];
10            int v = ele[1];
11
12            adj.get(u).add(v);
13            adj.get(v).add(u);
14        }
15
16        int distx[] = bfs(adj,x,n);
17        int disty[]= bfs(adj,y,n);
18        int distz[] = bfs(adj,z,n);
19
20        int cnt =0;
21        for(int i=0;i<n; i++){
22            int a = distx[i];
23            int b = disty[i];
24            int c = distz[i];
25            int arr[] = {a,b,c};
26            Arrays.sort(arr) ;
27            x = arr[0];
28            y =arr[1];
29            z = arr[2];
30            if( (x*x)+ (y*y) == (z*z) ){
31                cnt++;
32            }
33        }
34        return cnt;
35        
36    }
37
38    public int[] bfs( List<List<Integer>> adj , int node , int n ){
39        int dis[] = new int[n];
40        Arrays.fill( dis , -1 );
41        dis[node]=0;
42        
43        Queue<Integer> que = new LinkedList<>();
44        que.add(node);
45        
46        while( !que.isEmpty() ){
47            int currnode = que.peek();
48            que.poll();
49            for( int nei : adj.get(currnode)){
50                if( dis[nei]==-1){
51                    dis[nei]=dis[currnode]+1;
52                    que.add(nei);
53                }
54            }
55        }
56        return dis;
57    }
58}