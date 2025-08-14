// Last updated: 14/8/2025, 4:28:03 pm
class Solution {
    public String restoreString(String s, int[] indices) {
        char ans[] = new char[s.length()];
        for( int i=0; i<s.length() ; i++){
            ans[indices[i]]= s.charAt(i);

        }
       
        return new String(ans);
    }
}