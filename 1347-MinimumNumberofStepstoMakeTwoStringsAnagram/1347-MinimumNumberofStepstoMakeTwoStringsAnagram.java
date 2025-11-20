// Last updated: 20/11/2025, 4:22:50 pm
class Solution {
    public int minSteps(String s, String t) {
        int map1[] = new int[26];
        int map2[] = new int[26];

        int n = s.length() ;

        for( int i = 0 ; i<n ; i++){
            map1[s.charAt(i)-'a']++;
            map2[t.charAt(i)-'a']++;
        }

        int c = 0 ;

        for( int i =0  ; i<26 ; i++){
            if( map1[i] > map2[i] ){
                c+= map1[i]-map2[i];
            }
        }

        return c ;
    }
}