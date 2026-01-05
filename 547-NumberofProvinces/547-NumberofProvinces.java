// Last updated: 5/1/2026, 12:59:04 pm
1class DS{
2    List<Integer> rank = new ArrayList<>();
3    List<Integer> par = new ArrayList<>();
4    List<Integer> size = new ArrayList<>();
5    public DS(int n ){
6        for( int i =0; i<=n ;i++){
7            rank.add(0);
8            par.add(i);
9            size.add(1);
10        }
11    }
12    public int find( int node){
13        if( node == par.get(node)){
14            return node;
15        }
16
17        int ult = find(par.get(node));
18        par.set(node, ult );
19        return par.get(node);
20    }
21
22    public void unionByRank( int u , int v){
23        int ult_u = find(u);
24        int ult_v = find(v);
25
26        if( ult_u == ult_v ) return ;
27        if( rank.get(ult_u) < rank.get(ult_v)){
28            par.set(ult_u , ult_v);
29        }
30        else if( rank.get(ult_v) < rank.get(ult_u) ){
31            par.set( ult_v , ult_u);
32        }
33        else{
34            par.set(ult_v , ult_u);
35            int rankU = rank.get( ult_u);
36            rank.set( ult_u , rankU+1); 
37        }
38    }
39
40    public void unionBySize( int u , int v){
41        int ult_u = find(u);
42        int ult_v = find(v);
43
44        if( ult_u == ult_v ) return ;
45
46        if( size.get(ult_u) < size.get(ult_v)){
47            par.set(ult_u , ult_v);
48            size.set(ult_v , size.get(ult_v) + size.get(ult_u));
49        }
50        else{
51            par.set( ult_v , ult_u);
52            size.set(ult_u , size.get(ult_v) + size.get(ult_u));
53        }
54    }
55}
56
57class Solution {
58    public int findCircleNum(int[][] isConnected) {
59        int V = isConnected.length; 
60
61        DS DisjoinSet = new DS(V);
62        int c = 0 ; 
63        for( int i=0 ; i<V ; i++){
64            for( int j = 0 ; j<V ;j++){
65                if( isConnected[i][j] == 1 ){
66                    DisjoinSet.unionByRank(i , j );
67                }
68            }
69        }
70
71        for( int i =0 ; i<V ; i++){
72            if( DisjoinSet.par.get(i) == i ) c++;
73        }
74        return c ;
75    }
76}