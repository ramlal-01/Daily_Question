// Last updated: 5/1/2026, 12:59:33 pm
1class DS{
2    List<Integer> rank = new ArrayList<>();
3    List<Integer> par = new ArrayList<>(); 
4    public DS(int n ){
5        for( int i =0; i<=n ;i++){
6            rank.add(0);
7            par.add(i); 
8        }
9    }
10    public int find( int node){
11        if( node == par.get(node)){
12            return node;
13        }
14
15        int ult = find(par.get(node));
16        par.set(node, ult );
17        return par.get(node);
18    }
19
20    public void unionByRank( int u , int v){
21        int ult_u = find(u);
22        int ult_v = find(v);
23
24        if( ult_u == ult_v ) return ;
25        if( rank.get(ult_u) < rank.get(ult_v)){
26            par.set(ult_u , ult_v);
27        }
28        else if( rank.get(ult_v) < rank.get(ult_u) ){
29            par.set( ult_v , ult_u);
30        }
31        else{
32            par.set(ult_v , ult_u);
33            int rankU = rank.get( ult_u);
34            rank.set( ult_u , rankU+1); 
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
48                    DisjoinSet.unionByRank(i , j );
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