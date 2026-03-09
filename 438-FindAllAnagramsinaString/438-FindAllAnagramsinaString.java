// Last updated: 9/3/2026, 4:31:20 pm
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        int map[]= new int[26];
4        int map2[] = new int[26];
5        List<Integer> ans = new ArrayList<>();
6        if (s.length() < p.length()) return ans;
7        for( int i = 0 ; i<p.length() ; i++){
8            map[ s.charAt(i)-'a']++;
9            map2[ p.charAt(i)-'a']++;
10        }
11        int i = 0;
12        int j = p.length() ;
13        while( j< s.length()){
14            if( Arrays.equals( map , map2) ) ans.add(i);
15            map[ s.charAt(i)-'a']--;
16            map[ s.charAt(j)-'a']++;
17             
18
19            i++;
20            j++;
21        }
22        if (Arrays.equals(map, map2)) ans.add(i);
23        return ans ;
24    }
25}