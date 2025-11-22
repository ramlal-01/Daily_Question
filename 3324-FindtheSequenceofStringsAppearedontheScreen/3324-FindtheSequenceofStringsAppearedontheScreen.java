// Last updated: 23/11/2025, 12:17:17 am
class Solution {
    public List<String> stringSequence(String target) {
        List<String> res = new ArrayList<>();
        int n = target.length();
        
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < n; i++) {

            int k = 97; 
            while (k <= target.charAt(i)) {
                StringBuilder temp = new StringBuilder(prefix);
                temp.append((char)k);

                res.add(temp.toString());
                k++;
            }

            prefix.append(target.charAt(i));
        }
        return res;
    }
}
