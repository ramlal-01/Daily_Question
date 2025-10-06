// Last updated: 6/10/2025, 6:13:55 am
class Solution {
    public String makeGood(String s) { 
        int n = s.length();

        Deque<Character> st = new ArrayDeque<>();

        for( int i =0 ; i<n ; i++){
            if( !st.isEmpty() && Math.abs(st.peek()- s.charAt(i) )==32){
                st.pop();
            }
            else{
                st.push( s.charAt(i));
            }
            
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}