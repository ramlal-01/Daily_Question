// Last updated: 5/1/2026, 1:00:28 pm
1class DS{ 
2    List<Integer> par = new ArrayList<>();
3    List<Integer> size = new ArrayList<>();
4    public DS(int n ){
5        for( int i =0; i<=n ;i++){
6            
7            par.add(i);
8            size.add(1);
9        }
10    }
11    public int find( int node){
12        if( node == par.get(node)){
13            return node;
14        }
15
16        int ult = find(par.get(node));
17        par.set(node, ult );
18        return par.get(node);
19    }
20
21
22    public void unionBySize( int u , int v){
23        int ult_u = find(u);
24        int ult_v = find(v);
25
26        if( ult_u == ult_v ) return ;
27
28        if( size.get(ult_u) < size.get(ult_v)){
29            par.set(ult_u , ult_v);
30            size.set(ult_v , size.get(ult_v) + size.get(ult_u));
31        }
32        else{
33            par.set( ult_v , ult_u);
34            size.set(ult_u , size.get(ult_v) + size.get(ult_u));
35        }
36    }
37}
38
39class Solution {
40    public int findCircleNum(int[][] isConnected) {
41        int V = isConnected.length; 
42
43        DS DisjoinSet = new DS(V);
44        int c = 0 ; 
45        for( int i=0 ; i<V ; i++){
46            for( int j = 0 ; j<V ;j++){
47                if( isConnected[i][j] == 1 ){
48                    DisjoinSet.unionBySize(i , j );
49                }
50            }
51        }
52
53        for( int i =0 ; i<V ; i++){
54            if( DisjoinSet.par.get(i) == i ) c++;
55        }
56        return c ;
57    }
58}