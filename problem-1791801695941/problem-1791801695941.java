// Last updated: 12/10/2026, 4:11:35 pm
1
2import java.util.*;
3
4class Solution {
5    public String decodeString(String s) {
6        int n = s.length();
7
8        Stack<Integer> st1 = new Stack<>();
9        Stack<String> st2 = new Stack<>();
10
11        for (int i = 0; i < n; i++) {
12            char c = s.charAt(i);
13
14            if (c >= '0' && c <= '9') {
15                int num = 0;
16
17                while (i < n && s.charAt(i) >= '0'
18                            && s.charAt(i) <= '9') {
19                    num = num * 10 + (s.charAt(i) - '0');
20                    i++;
21                }
22
23                i--;
24                st1.push(num);
25            }
26            else if (c == ']') {
27                StringBuilder sb = new StringBuilder();
28
29                while (!st2.peek().equals("[")) {
30                    sb.append(st2.pop());
31                }
32
33                st2.pop(); 
34                // sb.reverse();
35
36                int no = st1.pop();
37                String str = sb.toString();
38
39                for (int j = 1; j < no; j++) {
40                    sb.append(str);
41                }
42
43                st2.push(sb.toString());
44            }
45            else {
46                st2.push(String.valueOf(c));
47            }
48        }
49
50        StringBuilder ans = new StringBuilder();
51
52        while (!st2.isEmpty()) {
53            ans.append(st2.pop());
54        }
55
56        return ans.reverse().toString();
57    }
58}
59