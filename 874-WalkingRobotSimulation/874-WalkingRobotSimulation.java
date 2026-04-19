// Last updated: 19/4/2026, 8:58:33 pm
1import java.util.*;
2
3class Solution {
4    public int robotSim(int[] commands, int[][] obstacles) {
5        // Store obstacles
6        Set<String> blocked = new HashSet<>();
7        for (int[] o : obstacles) {
8            blocked.add(o[0] + "," + o[1]);
9        }
10
11        // Directions: North, East, South, West
12        int[][] directions = {
13            {0, 1}, {1, 0}, {0, -1}, {-1, 0}
14        };
15
16        int x = 0, y = 0;
17        int dir = 0; // initially facing North
18        int maxDist = 0;
19
20        for (int cmd : commands) {
21            if (cmd == -1) {
22                dir = (dir + 1) % 4; // turn right
23            } 
24            else if (cmd == -2) {
25                dir = (dir + 3) % 4; // turn left
26            } 
27            else {
28                while (cmd-- > 0) {
29                    int nx = x + directions[dir][0];
30                    int ny = y + directions[dir][1];
31
32                    // check obstacle
33                    if (blocked.contains(nx + "," + ny)) break;
34
35                    x = nx;
36                    y = ny;
37
38                    maxDist = Math.max(maxDist, x * x + y * y);
39                }
40            }
41        }
42
43        return maxDist;
44    }
45}