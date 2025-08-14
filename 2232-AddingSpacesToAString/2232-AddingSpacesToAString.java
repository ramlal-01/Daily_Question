// Last updated: 14/8/2025, 4:27:02 pm
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str= new StringBuilder("") ;
        int k=0;
        
        for( int i=0; i<s.length() ; i++){
            
            if(  k<spaces.length && i==spaces[k] ){
                str.append(" ");
                k++;
            }
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}