// Last updated: 14/8/2025, 4:27:54 pm
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1= "";
        String s2= "";

        for( String ele: word1){
            s1+=ele;
        }
        for( String ele: word2){
            s2+=ele;
        }

        return s1.equals(s2);
    }
}