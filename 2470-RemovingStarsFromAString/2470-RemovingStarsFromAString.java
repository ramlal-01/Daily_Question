// Last updated: 14/8/2025, 4:26:39 pm
class Solution {
    public String removeStars(String s) {
        ArrayDeque<Character> st = new ArrayDeque<>();
        int n = s.length();
        for( int i=0 ; i<n ; i++){
            if( !st.isEmpty() && s.charAt(i)=='*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
            
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        StringBuilder res = new StringBuilder();
        for( int i=sb.length()-1; i>=0 ; i--){
            res.append(sb.charAt(i));
        }
        return res.toString();
    }
}