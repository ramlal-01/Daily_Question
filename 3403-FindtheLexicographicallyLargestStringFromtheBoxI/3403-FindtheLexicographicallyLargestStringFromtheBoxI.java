// Last updated: 14/10/2025, 6:27:45 am
class Solution {
    public String answerString(String word, int numFriends) {
        if( numFriends==1) return word ;

        int longest = word.length() - (numFriends-1);
        int n = word.length() ;
        String res = "";
        for( int i = 0 ; i<n ; i++){
            int poss = Math.min( n , i+ longest);
            String s = word.substring(i,poss);
            if( s.compareTo(res)>0){
                res = s ;
            }
        }
        return res ;
    }
}