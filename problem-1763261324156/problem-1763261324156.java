// Last updated: 16/11/2025, 8:18:44 am
class Solution {
    public int minLengthAfterRemovals(String s) {
        ArrayDeque<Character> st = new ArrayDeque<>();

        for( int i = 0 ; i<s.length() ; i++){
            if( !st.isEmpty() && st.peek()=='a' && s.charAt(i)=='b'){
                st.pop();
                
            }
            else if( !st.isEmpty() && st.peek()=='b' && s.charAt(i)=='a' ){
                st.pop();
            }
            else st.push( s.charAt(i) );
        }

        // System.out.println( st );

        return st.size();
    }
}