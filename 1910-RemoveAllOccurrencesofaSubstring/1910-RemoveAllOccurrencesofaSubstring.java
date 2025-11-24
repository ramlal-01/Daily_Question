// Last updated: 24/11/2025, 3:55:34 pm
class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();

        int n = part.length() ;

        for( char ch : s.toCharArray() ){
            sb.append( ch );

            if( sb.length() >= n){
                if(sb.substring(sb.length()-n).equals(part)){
                    sb.delete( sb.length()-n , sb.length());
                }
            }
        }
        return sb.toString();
    }
}