// Last updated: 21/4/2026, 12:25:05 pm
1class Solution {
2    public int minimumHammingDistance(int[] source, int[] target, int[][] arr) {
3        int n = source.length;
4
5        List<List<Integer>> adj = new ArrayList<>();
6        for (int i = 0; i < n; i++) {
7            adj.add(new ArrayList<>());
8        }
9
10        for (int[] ele : arr) {
11            adj.get(ele[0]).add(ele[1]);
12            adj.get(ele[1]).add(ele[0]);
13        }
14
15        boolean[] vis = new boolean[n];
16        int ans = 0;
17
18        for (int i = 0; i < n; i++) {
19            if (!vis[i]) {
20
21                List<Integer> comp = new ArrayList<>();
22                dfs(adj, vis, comp, i);
23
24                Map<Integer, Integer> map = new HashMap<>();
25 
26                for (int idx : comp) {
27                    map.put(source[idx], map.getOrDefault(source[idx], 0) + 1);
28                }
29 
30                int mismatch = 0;
31                for (int idx : comp) {
32                    if (map.getOrDefault(target[idx], 0) > 0) {
33                        map.put(target[idx], map.get(target[idx]) - 1);
34                    } else {
35                        mismatch++;
36                    }
37                }
38
39                ans += mismatch;
40            }
41        }
42
43        return ans;
44    }
45
46    public void dfs(List<List<Integer>> adj, boolean[] vis, List<Integer> comp, int node) {
47        vis[node] = true;
48        comp.add(node);
49
50        for (int nei : adj.get(node)) {
51            if (!vis[nei]) {
52                dfs(adj, vis, comp, nei);
53            }
54        }
55    }
56}