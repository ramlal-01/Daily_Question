// Last updated: 6/8/2026, 11:18:53 pm
1class Solution {
2    public int[][] buildMatrix(int k, int[][] rows, int[][] cols) {
3        int[][] res = new int[k][k] ;
4
5        List<Integer> rlist = topo( rows , k ) ;
6        List<Integer> clist = topo( cols , k ) ;
7
8        if (rlist.isEmpty() || clist.isEmpty()) {
9            return new int[0][0];
10        }
11        
12        int[][] grid  = new int[k][2] ;
13
14        for(  int i = 0 ; i<k ; i++ ) {
15            grid[rlist.get(i)][0] = i;
16            grid[clist.get(i)][1] = i ;
17        }
18
19        for(  int i = 0 ; i<k ; i++ ){
20            res[ grid[i][0] ][ grid[i][1] ] = i+1 ;
21        }
22        return res ;
23    }
24
25    public List<Integer> topo( int[][] grid , int k  ){
26        List<Integer> list = new ArrayList<>() ;
27
28        List<List<Integer>> adj = new ArrayList<>() ;
29        for( int i = 0 ; i<k ; i++) adj.add( new ArrayList<>());
30
31        int indegree[] = new int[k] ;
32
33        for( int arr[] : grid ){
34            adj.get(arr[0]-1).add(arr[1]-1) ;
35            indegree[arr[1]-1]++;
36        }
37
38        Queue<Integer> q = new LinkedList<>() ;
39
40        for(  int i = 0 ; i<k ; i++ ) {
41            if( indegree[i]==0 ){
42                q.add(i) ;
43            }
44        }
45
46        while( !q.isEmpty()){
47            int node = q.poll() ;
48
49            list.add(node) ;
50
51            for( int nei : adj.get(node) ){
52                indegree[nei]--;
53                if( indegree[nei]==0 ){
54                    q.add(nei);
55                }
56            }
57        }
58        if (list.size() != k) {
59            return new ArrayList<>();
60        } 
61
62        return list ;
63    }
64}