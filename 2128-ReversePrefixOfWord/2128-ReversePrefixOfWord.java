// Last updated: 14/8/2025, 4:27:15 pm
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
        return word;
        }
        StringBuilder res = new StringBuilder(word.substring(0, index + 1)).reverse();
        res.append(word.substring(index + 1));
        return res.toString();
    }
}