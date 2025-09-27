// Last updated: 27/9/2025, 8:19:31 am
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String curr = new String(chars);

            if (!map.containsKey(curr)) {
                map.put(curr, new ArrayList<>());
            }
            map.get(curr).add(s);
        }

        return new ArrayList<>(map.values());
    }
}