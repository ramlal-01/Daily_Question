// Last updated: 23/12/2025, 3:59:01 pm
1class Solution {
2    class Word {
3        String text;
4        int len;
5        int idx;
6        Word(String t, int i) {
7            text = t;
8            len = t.length();
9            idx = i;
10        }
11    }
12
13    public String arrangeWords(String text) {
14        String[] words = text.toLowerCase().split(" ");
15        int n = words.length;
16
17        Word[] arr = new Word[n];
18        for (int i = 0; i < n; i++) {
19            arr[i] = new Word(words[i], i);
20        }
21
22        Arrays.sort(arr, (a, b) -> {
23            if (a.len != b.len) return a.len - b.len;
24            return a.idx - b.idx;
25        });
26
27        StringBuilder sb = new StringBuilder();
28        for (int i =0;i<n;i++) {
29            sb.append(arr[i].text);
30            if (i<n-1) sb.append(" ");
31        }
32
33        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
34        return sb.toString();
35    }
36}
37