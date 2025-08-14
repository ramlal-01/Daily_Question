// Last updated: 14/8/2025, 4:25:22 pm
class Solution {
    public String winningPlayer(int x, int y) {
        int moves = Math.min(x, y / 4);

     
        if (moves % 2 == 1) {
            return "Alice";
        } 
            return "Bob";
    }
}