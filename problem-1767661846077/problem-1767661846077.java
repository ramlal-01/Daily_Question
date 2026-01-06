// Last updated: 6/1/2026, 6:40:46 am
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
12
13    public int find( int node){
14        if( node == par.get(node)){
15            return node;
16        }
17
18        int ult = find(par.get(node));
19        par.set(node, ult );
20        return par.get(node);
21    }
22
23    public void unionByRank( int u , int v){
24        int ult_u = find(u);
25        int ult_v = find(v);
26
27        if( ult_u == ult_v ) return ;
28        if( rank.get(ult_u) < rank.get(ult_v)){
29            par.set(ult_u , ult_v);
30        }
31        else if( rank.get(ult_v) < rank.get(ult_u) ){
32            par.set( ult_v , ult_u);
33        }
34        else{
35            par.set(ult_v , ult_u);
36            int rankU = rank.get( ult_u);
37            rank.set( ult_u , rankU+1); 
38        }
39    }
40
41    public void unionBySize( int u , int v){
42        int ult_u = find(u);
43        int ult_v = find(v);
44
45        if( ult_u == ult_v ) return ;
46
47        if( size.get(ult_u) < size.get(ult_v)){
48            par.set(ult_u , ult_v);
49            size.set(ult_v , size.get(ult_v) + size.get(ult_u));
50        }
51        else{
52            par.set( ult_v , ult_u);
53            size.set(ult_u , size.get(ult_v) + size.get(ult_u));
54        }
55    }
56}
57class Solution{
58private boolean isValid(int row, int col, int n) {
59    return row >= 0 && row < n && col >= 0 && col < n;
60}
61
62
63public int largestIsland(int grid[][]) {
64    int n = grid.length;
65    DS ds = new DS(n * n);
66
67    // step -1
68    for (int row = 0; row < n; row++) {
69        for (int col = 0; col < n; col++) {
70            if (grid[row][col] == 0) continue;
71
72            int dr[] = {-1, 0, 1, 0};
73            int dc[] = {0, -1, 0, 1};
74
75            for (int ind = 0; ind < 4; ind++) {
76                int newr = row + dr[ind];
77                int newc = col + dc[ind];
78
79                if (isValid(newr, newc, n) && grid[newr][newc] == 1) {
80                    int nodeNo = row * n + col;
81                    int adjNodeNo = newr * n + newc;
82                    ds.unionBySize(nodeNo, adjNodeNo);
83                }
84            }
85        }
86    }
87
88    // step 2
89    int mx = 0;
90    for (int row = 0; row < n; row++) {
91        for (int col = 0; col < n; col++) {
92            if (grid[row][col] == 1) continue;
93
94            int dr[] = {-1, 0, 1, 0};
95            int dc[] = {0, -1, 0, 1};
96
97            HashSet<Integer> components = new HashSet<>();
98
99            for (int ind = 0; ind < 4; ind++) {
100                int newr = row + dr[ind];
101                int newc = col + dc[ind];
102
103                if (isValid(newr, newc, n)) {
104                    if (grid[newr][newc] == 1) {
105                        components.add(ds.find(newr * n + newc));
106                    }
107                }
108            }
109
110            int sizeTotal = 0;
111            for (Integer parents : components) {
112                sizeTotal += ds.size.get(parents);
113            }
114
115            mx = Math.max(mx, sizeTotal + 1);
116        }
117    }
118
119    for (int cellNo = 0; cellNo < n * n; cellNo++) {
120        mx = Math.max(mx, ds.size.get(ds.find(cellNo)));
121    }
122
123    return mx;
124}
125}