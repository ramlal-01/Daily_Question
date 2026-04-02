// Last updated: 2/4/2026, 10:50:08 pm
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        int i =0 ;
5        int j =0 ;
6        int n = s.length();
7        int max = 0 ;
8        while( j<n){
9            if( map.containsKey(s.charAt(j)) && map.get( s.charAt(j))>=i ){
10                i= map.get( s.charAt(j))+1;
11            }
12            map.put( s.charAt(j) , j);
13
14            max = Math.max( max , j-i+1);
15            j++;
16        }
17        return max ;
18    }
19}