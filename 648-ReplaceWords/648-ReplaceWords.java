// Last updated: 29/4/2026, 9:13:17 pm
1class Solution {
2    public String replaceWords(List<String> dictionary, String sentence) {
3
4        HashSet<String> set = new HashSet<>(dictionary);
5
6        String[] words = sentence.split(" ");
7        StringBuilder result = new StringBuilder();
8
9        for (String word : words) {
10            String replacement = word;
11
12            for (int i = 1; i <= word.length(); i++) {
13                String prefix = word.substring(0, i);
14                if (set.contains(prefix)) {
15                    replacement = prefix;
16                    break; // shortest mil gaya
17                }
18            }
19
20            result.append(replacement).append(" ");
21        }
22
23        return result.toString().trim();
24    }
25}