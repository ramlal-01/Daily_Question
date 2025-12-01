// Last updated: 1/12/2025, 7:48:12 pm
1class Solution {
2    public long maxRunTime(int n, int[] batteries) {
3        long sum = 0;
4        for (int b : batteries) {
5            sum += b;
6        }
7        
8        long low = 0;
9        long high = sum / n;  
10        
11        while (low < high) {
12            long mid = low + (high - low + 1) / 2;  
13            
14            if (canRun(mid, n, batteries)) {
15                low = mid;   
16            } else {
17                high = mid - 1; 
18            }
19        }
20        
21        return low;
22    }
23    
24    private boolean canRun(long time, int n, int[] batteries) {
25        long total = 0;
26        for (int b : batteries) {
27            total += Math.min((long)b, time);
28            if (total >= time * n) {  // already enough
29                return true;
30            }
31        }
32        return total >= time * n;
33    }
34}
35