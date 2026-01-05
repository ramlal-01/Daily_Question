// Last updated: 5/1/2026, 9:20:52 pm
1import java.util.*;
2import java.util.ArrayList;
3
4class DS{
5    List<Integer> par = new ArrayList<>();
6    List<Integer> size = new ArrayList<>();
7
8    public DS(int n){
9        for(int i = 0; i <= n; i++){
10            par.add(i);
11            size.add(1);
12        }
13    }
14
15    public int find(int node){
16        if(node == par.get(node)) return node;
17        int ult = find(par.get(node));
18        par.set(node, ult);
19        return ult;
20    }
21
22    public void unionBySize(int u, int v){
23        int pu = find(u);
24        int pv = find(v);
25        if(pu == pv) return;
26
27        if(size.get(pu) < size.get(pv)){
28            par.set(pu, pv);
29            size.set(pv, size.get(pv) + size.get(pu));
30        } else {
31            par.set(pv, pu);
32            size.set(pu, size.get(pu) + size.get(pv));
33        }
34    }
35}
36
37class Solution {
38    public List<List<String>> accountsMerge(List<List<String>> accounts) {
39        int n = accounts.size();
40        DS ds = new DS(n);
41
42        HashMap<String, Integer> mapMailNode = new HashMap<>();
43
44        for(int i = 0; i < n; i++){
45            for(int j = 1; j < accounts.get(i).size(); j++){
46                String mail = accounts.get(i).get(j);
47                if(!mapMailNode.containsKey(mail)){
48                    mapMailNode.put(mail, i);
49                } else {
50                    ds.unionBySize(i, mapMailNode.get(mail));
51                }
52            }
53        }
54
55        ArrayList<String>[] mergeMail = new ArrayList[n];
56        for(int i = 0; i < n; i++){
57            mergeMail[i] = new ArrayList<>();
58        }
59
60        for(Map.Entry<String, Integer> it : mapMailNode.entrySet()){
61            String mail = it.getKey();
62            int node = ds.find(it.getValue());
63            mergeMail[node].add(mail);
64        }
65
66        List<List<String>> ans = new ArrayList<>();
67
68        for(int i = 0; i < n; i++){
69            if(mergeMail[i].size() == 0) continue;
70            Collections.sort(mergeMail[i]);
71            List<String> temp = new ArrayList<>();
72            temp.add(accounts.get(i).get(0));
73            temp.addAll(mergeMail[i]);
74            ans.add(temp);
75        }
76
77        return ans;
78    }
79}
80