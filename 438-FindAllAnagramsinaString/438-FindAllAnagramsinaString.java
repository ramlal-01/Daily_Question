// Last updated: 1/10/2025, 8:42:34 am
class Solution {
    public boolean allZeroes( int[] map){
        for( int ele : map){
            if( ele!=0) return false ;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();

        int map[] = new int[26];

        for( int i =0  ; i< p.length() ; i++){
            char ch = p.charAt(i);
            map[ch-'a']++;
        }

        int i =0 , j =0 ; 

        int k = p.length() ;

        while( j< n ){
            map[ s.charAt(j)-'a']--;

            if( j-i+1 == k){
                if( allZeroes(map)){
                    res.add(i);
                }

                map[s.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return res;
    }
}
