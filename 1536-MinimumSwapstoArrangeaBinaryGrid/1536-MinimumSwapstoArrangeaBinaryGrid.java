// Last updated: 2/3/2026, 3:51:05 pm
1class Solution {
2    public int minSwaps(int[][] grid) {
3        int n = grid.length;
4        
5        // Step 1: compute rightmost 1 for each row
6        int[] maxRight = new int[n];
7        
8        for (int i = 0; i < n; i++) {
9            int rightMost = -1;
10            for (int j = 0; j < n; j++) {
11                if (grid[i][j] == 1) {
12                    rightMost = j;
13                }
14            }
15            maxRight[i] = rightMost;
16        }
17        
18        int swaps = 0;
19        
20        // Step 2: greedy row fixing
21        for (int i = 0; i < n; i++) {
22            
23            int j = i;
24            
25            // find suitable row
26            while (j < n && maxRight[j] > i) {
27                j++;
28            }
29            
30            // no valid row found
31            if (j == n) return -1;
32            
33            // bring row j to position i
34            while (j > i) {
35                int temp = maxRight[j];
36                maxRight[j] = maxRight[j - 1];
37                maxRight[j - 1] = temp;
38                
39                swaps++;
40                j--;
41            }
42        }
43        
44        return swaps;
45    }
46}