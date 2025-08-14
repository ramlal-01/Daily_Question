// Last updated: 14/8/2025, 4:27:32 pm
class Solution {
    public String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        StringBuilder s2 = new StringBuilder();
        for( int i=0; i<k; i++){
            s2.append(s1[i]+" ");
        }
        return s2.toString().trim();
    }
}