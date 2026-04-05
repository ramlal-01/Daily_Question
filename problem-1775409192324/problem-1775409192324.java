// Last updated: 5/4/2026, 10:43:12 pm
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x = 0, y = 0;
4        for (char m : moves.toCharArray()) {
5            if (m == 'R') x++;
6            else if (m == 'L') x--;
7            else if (m == 'U') y++;
8            else if (m == 'D') y--;
9        }
10        return x == 0 && y == 0;
11    }
12}