// Last updated: 20/11/2025, 3:05:29 pm
class Solution {
    public String smallestNumber(String pattern) {
        ArrayDeque<Integer> st = new ArrayDeque<>();

        int n = pattern.length()+1 ;

        StringBuilder sb = new StringBuilder();
        for( int i = 0 ; i<n ; i++){
            st.push(i+1);

            if( i==n-1 || pattern.charAt(i)=='I'){
                while(!st.isEmpty() ){
                    sb.append( st.pop());
                }   
            }
        }

        return sb.toString();
    }
}