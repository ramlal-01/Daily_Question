// Last updated: 14/4/2026, 11:26:46 pm
1class Solution {
2    public int minimumLengthEncoding(String[] words) {
3
4        HashSet<String> set = new HashSet<>(Arrays.asList(words));
5
6        for (String word : words) {
7            for (int i = 1; i < word.length(); i++) {
8                set.remove(word.substring(i)); // remove suffix
9            }
10        }
11
12        int result = 0;
13
14        for (String word : set) {
15            result += word.length() + 1; // +1 for '#'
16        }
17
18        return result;
19    }
20}