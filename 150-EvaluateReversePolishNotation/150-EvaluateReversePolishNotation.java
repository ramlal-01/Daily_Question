// Last updated: 6/10/2025, 8:12:00 pm
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> st = new ArrayDeque<>();
 
        for( int i = 0 ; i<tokens.length ; i++){

            if( !st.isEmpty() && tokens[i].equals("*")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push( Integer.toString(a*b));
                 
            }
            else if( !st.isEmpty() && tokens[i].equals("/") ){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push( Integer.toString(b/a));
            }
            else if(  !st.isEmpty() && tokens[i].equals("+")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push(Integer.toString(a+b));
            }
            else if(  !st.isEmpty() && tokens[i].equals("-")){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                st.push( Integer.toString(b-a));
            }
            else{
                st.push(tokens[i]);
            }
        }
        return Integer.parseInt(st.pop());
    }
}