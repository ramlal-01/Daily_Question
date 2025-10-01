// Last updated: 1/10/2025, 7:04:00 am
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0 ;
        int end = 0 ;
        int max = 0;

        HashMap<Character , Integer> map = new HashMap<>();
        while( end < s.length()){

            if( map.containsKey( s.charAt(end)) && map.get(s.charAt(end))>= start ){
                start = map.get(s.charAt(end)) + 1 ;
            }

            max = Math.max( max , end-start+1);

            map.put( s.charAt(end) , end );
            end++;
        }
        return max ;
    }
}