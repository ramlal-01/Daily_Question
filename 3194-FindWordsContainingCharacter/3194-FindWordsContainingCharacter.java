// Last updated: 14/8/2025, 4:25:45 pm
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            boolean found = false;

            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    found = true;
                    break; 
                }
            }
            if (found) {
                res.add(i);
            }
        }
        
        return res;
    }
}
