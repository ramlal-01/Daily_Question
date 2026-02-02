// Last updated: 2/2/2026, 10:38:34 pm
1class Solution {
2    public long minimumCost(int[] nums, int k, int dist) {
3
4        int n = nums.length;
5        TreeSet<Integer> sel = new TreeSet<>((a, b) -> {
6            if(nums[a] == nums[b]) return a-b;
7            return nums[a] - nums[b];
8        });
9        TreeSet<Integer> rem = new TreeSet<>((a, b) -> {
10            if(nums[a] == nums[b]) return a-b;
11            return nums[a] - nums[b];
12        });
13
14        k = k - 1;
15
16        long currSum = 0;
17        long ans = Long.MAX_VALUE;
18        int last = Math.min(dist+1, n-1);
19        for (int i = 1; i <= last; i++) {
20            currSum += nums[i];
21            sel.add(i);
22        }
23
24        while (sel.size() > k) {
25            int idx = sel.pollLast();
26            currSum -= nums[idx];
27            rem.add(idx);
28        }
29
30        ans = currSum;
31
32        for (int r = dist + 2, l= 1; r < n; r++, l++) {
33
34            rem.add(r);
35
36            if (sel.contains(l)) {
37                sel.remove(l);
38                currSum -= nums[l];
39
40                int smallest = rem.pollFirst();
41                sel.add(smallest);
42                currSum += nums[smallest];
43            } else {
44                rem.remove(l);
45
46                if (!sel.isEmpty() && !rem.isEmpty()
47                        && nums[sel.last()] > nums[rem.first()]) {
48
49                    int big = sel.pollLast();
50                    currSum -= nums[big];
51                    rem.add(big);
52
53                    int small = rem.pollFirst();
54                    sel.add(small);
55                    currSum += nums[small];
56                }
57            }
58
59            ans = Math.min(ans, currSum);
60        }
61
62        return nums[0] + ans;
63    }
64}