// Last updated: 6/1/2026, 7:51:12 am
1 class Pair {
2    int dif;
3    int row;
4    int col;
5    Pair(int d, int r, int c) {
6        dif = d;
7        row = r;
8        col = c;
9    }
10}
11class Solution {
12    public int swimInWater(int[][] heights) {
13        int m = heights.length;
14        int n = heights[0].length;
15 
16        int[][] diff = new int[m][n];
17
18        for (int i = 0; i < m; i++) {
19            Arrays.fill(diff[i], Integer.MAX_VALUE);
20        }
21
22        PriorityQueue<Pair> q = new PriorityQueue<>( (a,b)->a.dif-b.dif);
23        q.add(new Pair(heights[0][0], 0, 0));
24        diff[0][0] = heights[0][0];
25
26
27        int[] delrow = {-1,0,1,0};
28        int[] delcol = { 0, 1, 0,-1};
29
30        while (!q.isEmpty()) {
31            Pair p = q.poll();
32            int difference = p.dif, r = p.row, c = p.col;
33
34            if (r == m-1 && c == n-1) return difference ;
35
36            for (int k = 0; k < 4; k++) {
37                int nr = r + delrow[k];
38                int nc = c + delcol[k];
39
40                if (nr >= 0 && nr < m && nc >= 0 && nc < n ) {
41                     
42                    int newdif = Math.max( heights[nr][nc] , difference ) ;
43
44                    if( newdif< diff[nr][nc] ){ 
45                        diff[nr][nc] = newdif;
46                        q.add(new Pair( newdif , nr, nc));
47                    }
48                    
49                }
50            }
51        }
52
53        return 0;
54    }
55}