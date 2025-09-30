// Last updated: 30/9/2025, 11:22:25 pm
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) return res;
        int[] a = new int[26];
        int[] b = new int[26];
        for (int i = 0; i < p.length(); i++) {
            a[p.charAt(i) - 'a']++;
            b[s.charAt(i) - 'a']++;
        }
        if (java.util.Arrays.equals(a, b)) res.add(0);
        for (int i = p.length(); i < s.length(); i++) {
            b[s.charAt(i) - 'a']++;
            b[s.charAt(i - p.length()) - 'a']--;
            if (java.util.Arrays.equals(a, b)) res.add(i - p.length() + 1);
        }
        return res;
    }
}
