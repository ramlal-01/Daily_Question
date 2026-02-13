// Last updated: 13/2/2026, 10:36:08 pm
1class Solution {
2    public int longestBalanced(String s) {
3        int n = s.length();
4        if (n == 0)
5            return 0;
6
7        char[] arr = s.toCharArray();
8        int ans = 0;
9 
10        ans = Math.max(ans, countOne(arr));
11 
12        ans = Math.max(ans, countTwo('a', 'b', arr));
13        ans = Math.max(ans, countTwo('b', 'c', arr));
14        ans = Math.max(ans, countTwo('c', 'a', arr));
15 
16        ans = Math.max(ans, countThree(arr));
17
18        return ans;
19    }
20
21    private int countOne(char[] arr) {
22        int ans = 0;
23        char curr = arr[0];
24        int count = 0;
25
26        for (char val : arr) {
27            if (val == curr) {
28                count++;
29            } else {
30                curr = val;
31                count = 1;
32            }
33            ans = Math.max(ans, count);
34        }
35        return ans;
36    }
37
38    private int countTwo(char n1, char n2, char[] arr) {
39        Map<Integer, Integer> map = new HashMap<>();
40        map.put(0, -1);
41
42        int sum = 0;
43        int ans = 0;
44
45        for (int i = 0; i < arr.length ; i++) {
46            if (arr[i] == n1) {
47                sum++;
48            } else if (arr[i] == n2) {
49                sum--;
50            } else {
51                map = new HashMap<>();
52                sum = 0;
53                map.put(0, i);
54                continue;
55            }
56
57            if (map.containsKey(sum)) {
58                ans = Math.max(ans, i - map.get(sum));
59            } else {
60                map.put(sum, i);
61            }
62        }
63
64        return ans;
65    }
66
67    private int countThree(char[] arr) {
68        Map<String, Integer> map = new HashMap<>();
69        map.put("0#0", -1);
70
71        int a = 0, b = 0, c = 0;
72        int maxLen = 0;
73
74        for (int i = 0; i < arr.length; i++) {
75            if (arr[i] == 'a')
76                a++;
77            else if (arr[i] == 'b')
78                b++;
79            else
80                c++;
81
82            int diff1 = a - b;
83            int diff2 = a - c;
84
85            String key = diff1 + "#" + diff2;
86
87            if (map.containsKey(key)) {
88                maxLen = Math.max(maxLen, i - map.get(key));
89            } else {
90                map.put(key, i);
91            }
92        }
93
94        return maxLen;
95    }
96}
97