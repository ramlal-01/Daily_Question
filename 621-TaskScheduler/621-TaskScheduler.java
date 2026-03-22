// Last updated: 22/3/2026, 11:21:03 pm
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3
4        int[] freq = new int[26];
5        for (char c : tasks) {
6            freq[c - 'A']++;
7        }
8
9        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
10
11        for (int f : freq) {
12            if (f > 0) pq.add(f);
13        }
14        int time = 0;
15
16        while (!pq.isEmpty()) {
17            List<Integer> temp = new ArrayList<>();
18            int cycle = n + 1;
19
20            while (cycle > 0 && !pq.isEmpty()) {
21                int f = pq.poll();
22                if (f - 1 > 0) temp.add(f - 1);
23                time++;
24                cycle--;
25            }
26            for (int t : temp) pq.add(t);
27
28            if (pq.isEmpty()) break;
29            time += cycle;  
30        }
31
32        return time;
33    }
34}