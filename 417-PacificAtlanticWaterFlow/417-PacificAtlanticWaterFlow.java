// Last updated: 16/3/2026, 12:45:33 pm
1class Solution {
2
3    boolean pacific;
4    boolean atlantic;
5
6    public List<List<Integer>> pacificAtlantic(int[][] heights) {
7
8        List<List<Integer>> res = new ArrayList<>();
9
10        int n = heights.length;
11        int m = heights[0].length;
12
13        for(int i = 0; i < n; i++){
14            for(int j = 0; j < m; j++){
15
16                pacific = false;
17                atlantic = false;
18
19                boolean[][] vis = new boolean[n][m];
20
21                helper(heights, vis, i, j);
22
23                if(pacific && atlantic){
24                    res.add(Arrays.asList(i, j));
25                }
26            }
27        }
28
29        return res;
30    }
31
32    public void helper(int[][] arr, boolean[][] vis, int row, int col){
33
34        int n = arr.length;
35        int m = arr[0].length;
36
37        if(vis[row][col]) return;
38
39        vis[row][col] = true;
40
41        // check oceans
42        if(row == 0 || col == 0) pacific = true;
43        if(row == n-1 || col == m-1) atlantic = true;
44
45        if(pacific && atlantic) return;
46
47        // down
48        if(row+1 < n && arr[row+1][col] <= arr[row][col]){
49            helper(arr, vis, row+1, col);
50        }
51
52        // right
53        if(col+1 < m && arr[row][col+1] <= arr[row][col]){
54            helper(arr, vis, row, col+1);
55        }
56
57        // up
58        if(row-1 >= 0 && arr[row-1][col] <= arr[row][col]){
59            helper(arr, vis, row-1, col);
60        }
61
62        // left
63        if(col-1 >= 0 && arr[row][col-1] <= arr[row][col]){
64            helper(arr, vis, row, col-1);
65        }
66    }
67}