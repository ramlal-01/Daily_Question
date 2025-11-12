// Last updated: 12/11/2025, 7:06:33 am
class Solution {
    int maxscore = 0;

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq = new int[26];
        for (char c : letters) freq[c - 'a']++;

        helper(0, words, freq, score, 0);
        return maxscore;
    }

    private void helper(int idx, String[] words, int[] freq, int[] score, int currScore) {
        if (idx == words.length) {
            maxscore = Math.max(maxscore, currScore);
            return;
        }

        helper(idx + 1, words, freq, score, currScore);

        int[] temp = freq.clone();
        int wordScore = 0;
        boolean canTake = true;

        for (char c : words[idx].toCharArray()) {
            if (--temp[c - 'a'] < 0) {
                canTake = false;
                break;
            }
            wordScore += score[c - 'a'];
        }

        if (canTake) {
            helper(idx + 1, words, temp, score, currScore + wordScore);
        }
    }
}
