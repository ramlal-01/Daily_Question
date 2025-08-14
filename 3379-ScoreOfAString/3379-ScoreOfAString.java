// Last updated: 14/8/2025, 4:25:35 pm
class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0; i<s.length()-1 ; i++){
            sum+= Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return sum;
    }
}