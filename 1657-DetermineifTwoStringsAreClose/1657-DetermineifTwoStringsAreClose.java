// Last updated: 12/10/2026, 3:10:17 pm
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        int len1 = word1.length();
4        int len2 = word2.length();
5
6        if( len1!=len2) return false ;
7
8        Set<Character> set = new HashSet<>();
9        Set<Character> set2 = new HashSet<>();
10
11        for( int i = 0 ; i<len1 ; i++){
12            set.add(word1.charAt(i));
13            set2.add(word2.charAt(i));
14        }
15
16        if( !set.equals(set2) )return false ;
17        
18        int[] a = new int[26];
19        int[] b = new int[26];
20
21        for (char c : word1.toCharArray())
22            a[c - 'a']++;
23
24        for (char c : word2.toCharArray())
25            b[c - 'a']++;
26
27        Arrays.sort(a);
28        Arrays.sort(b);
29
30        return Arrays.equals(a, b);
31
32    }
33}