// Last updated: 5/1/2026, 1:19:55 pm
1class DS{ 
2    List<Integer> par = new ArrayList<>();
3    List<Integer> size = new ArrayList<>();
4    public DS(int n ){
5        for( int i =0; i<=n ;i++){ 
6            par.add(i);
7            size.add(1);
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
20    public void unionBySize( int u , int v){
21        int ult_u = find(u);
22        int ult_v = find(v);
23
24        if( ult_u == ult_v ) return ;
25
26        if( size.get(ult_u) < size.get(ult_v)){
27            par.set(ult_u , ult_v);
28            size.set(ult_v , size.get(ult_v) + size.get(ult_u));
29        }
30        else{
31            par.set( ult_v , ult_u);
32            size.set(ult_u , size.get(ult_v) + size.get(ult_u));
33        }
34    }
35}
36
37class Solution {
38    public int makeConnected(int n, int[][] connections) {
39
40        DS dis = new DS(n);
41
42        int cntExtra = 0 ;
43        for( int ele[] : connections ){
44            if( dis.find(ele[0]) == dis.find(ele[1]) ){
45                cntExtra++;
46            }
47            else {
48                dis.unionBySize( ele[0] , ele[1]);
49            }
50        }
51
52        int c = 0 ;
53
54        for( int i = 0 ; i<n ; i++){
55            if( dis.par.get(i) == i ){
56                c++;
57            }
58        }
59        int ans = c-1 ;
60
61        if( cntExtra>=ans ) return ans ;
62        return -1 ;
63    }
64}