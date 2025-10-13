// Last updated: 14/10/2025, 4:11:48 am
class Solution {
    public String answerString(String word, int numFriends) { 
        if (numFriends == 1) return word;

        String result = "";
        int longest = word.length() - (numFriends - 1);

        for (int i = 0; i < word.length(); i++) {
            int end = Math.min(word.length(), i + longest);
            String sub = word.substring(i, end);
            if (sub.compareTo(result) > 0) {
                result = sub;
            }
        }

        return result;
    }
}
