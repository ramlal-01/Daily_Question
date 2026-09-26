// Last updated: 26/9/2026, 9:48:23 am
1class Solution {
2    public String evaluate(String s, List<List<String>> knowledge) {
3
4        HashMap<String, String> map = new HashMap<>();
5
6        for (List<String> list : knowledge) {
7            map.put(list.get(0), list.get(1));
8        }
9
10        int i = 0;
11
12        while (i < s.length()) {
13
14            if (s.charAt(i) == '(') {
15
16                int l = i;
17                int r = i;
18
19                while (r < s.length() && s.charAt(r) != ')') {
20                    r++;
21                }
22
23                String key = s.substring(l + 1, r);
24
25                String value = map.getOrDefault(key, "?");
26
27                s = s.substring(0, l) + value + s.substring(r + 1);
28
29                i = l + value.length();
30
31            } else {
32                i++;
33            }
34        }
35
36        return s;
37    }
38}