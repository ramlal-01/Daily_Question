// Last updated: 27/11/2025, 10:36:52 pm
1class Solution {
2    Set<String> set = new HashSet<>();
3
4    public int numTilePossibilities(String tiles) {
5        boolean[] used = new boolean[tiles.length()];
6        helper(tiles, used, new StringBuilder());
7        return set.size();
8    }
9
10    public void helper(String tiles, boolean[] used, StringBuilder sb) {
11        if (sb.length() > 0) {
12            set.add(sb.toString());  
13        }
14        for (int i = 0; i < tiles.length(); i++) {
15            if (used[i]) continue;
16
17            used[i] = true;
18            sb.append(tiles.charAt(i));
19
20            helper(tiles, used, sb);
21            sb.deleteCharAt(sb.length() - 1);
22            used[i] = false;
23        }
24    }
25}
26