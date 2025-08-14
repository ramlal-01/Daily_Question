// Last updated: 14/8/2025, 4:27:27 pm
class Solution {
    public boolean checkIfPangram(String sentence) {
        String s2=sentence.toLowerCase();
        String a = "abcdefghijklmnopqrstuvwxyz";
        Set<String> s1= new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if( a.contains(Character.toString(ch)) ){
                s1.add(Character.toString(ch));
            }
            
        }
        // s1.remove(" ");
        // s1.remove(",");
        // System.out.println(s1);
        if(s1.size()==26){
            return true;
        }
        return false;
    }
}