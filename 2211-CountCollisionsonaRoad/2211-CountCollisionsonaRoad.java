// Last updated: 4/12/2025, 10:41:10 pm
1class Solution {
2    public int countCollisions(String directions) {
3        int n = directions.length();
4        int i = 0, j = n - 1;
5        
6        while (i < n && directions.charAt(i) == 'L') {
7            i++;
8        }
9        
10        while (j >= 0 && directions.charAt(j) == 'R') {
11            j--;
12        }
13        
14        int collisions = 0;
15        for (int k = i; k <= j; k++) {
16            if (directions.charAt(k) != 'S') {
17                collisions++;
18            }
19        }
20        
21        return collisions;
22    }
23}