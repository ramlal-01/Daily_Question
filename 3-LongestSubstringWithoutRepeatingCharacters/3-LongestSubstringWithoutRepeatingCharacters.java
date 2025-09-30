// Last updated: 30/9/2025, 11:07:17 pm
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0; // left pointer
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
 
            if (map.containsKey(c) && map.get(c) >= i) {
                i = map.get(c) + 1;
            } 
            map.put(c, j);
 
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
