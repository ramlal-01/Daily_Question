// Last updated: 23/4/2026, 6:20:09 am
1class Solution {
2    public List<String> twoEditWords(String[] queries, String[] arr) {
3        int n = queries[0].length();
4
5        List<String> list = new ArrayList<>();
6
7        for (String s : queries) {
8            for (String ele : arr) {
9                int cnt = 0;
10
11                for (int i = 0; i < n; i++) {
12                    if (s.charAt(i) != ele.charAt(i)) {
13                        cnt++;
14                    }
15                    if (cnt > 2) break; 
16                }
17
18                if (cnt <= 2) {
19                    list.add(s);
20                    break;  
21                }
22            }
23        }
24
25        return list;
26    }
27}