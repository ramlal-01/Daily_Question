// Last updated: 13/12/2025, 6:11:21 pm
1import java.util.*;
2
3class Solution {
4    public List<String> validateCoupons(
5            String[] code,
6            String[] businessLine,
7            boolean[] isActive) {
8
9        Map<String, Integer> priority = new HashMap<>();
10        priority.put("electronics", 0);
11        priority.put("grocery", 1);
12        priority.put("pharmacy", 2);
13        priority.put("restaurant", 3);
14
15        List<Pair> valid = new ArrayList<>();
16
17        for (int i = 0; i < code.length; i++) {
18            if (!isActive[i]) continue;
19            if (!priority.containsKey(businessLine[i])) continue;
20            if (!isValidCode(code[i])) continue;
21
22            valid.add(new Pair(code[i], businessLine[i]));
23        }
24
25        Collections.sort(valid, (a, b) -> {
26            int p1 = priority.get(a.line);
27            int p2 = priority.get(b.line);
28            if (p1 != p2) return p1 - p2;
29            return a.code.compareTo(b.code);
30        });
31
32        List<String> result = new ArrayList<>();
33        for (Pair p : valid) result.add(p.code);
34
35        return result;
36    }
37
38    private boolean isValidCode(String s) {
39        if (s == null || s.length() == 0) return false;
40        for (char c : s.toCharArray()) {
41            if (!Character.isLetterOrDigit(c) && c != '_') {
42                return false;
43            }
44        }
45        return true;
46    }
47
48    static class Pair {
49        String code;
50        String line;
51        Pair(String c, String l) {
52            code = c;
53            line = l;
54        }
55    }
56}
57