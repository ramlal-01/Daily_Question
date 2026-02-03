// Last updated: 3/2/2026, 12:32:52 pm
1class Solution {
2    public boolean isTrionic(int[] nums) {
3        if (nums.length < 4) return false;
4
5        List<Integer> list = new ArrayList<>();
6
7        int n = nums.length;
8        for (int i = 1; i < n; i++) {
9            if (nums[i - 1] < nums[i]) {
10                list.add(1);
11            } else if (nums[i - 1] > nums[i]) {
12                list.add(0);
13            } else {
14                return false;
15            }
16        }
17
18        int changes = 0;
19        for (int i = 1; i < list.size(); i++) {
20            if (!list.get(i).equals(list.get(i - 1))) {
21                changes++;
22            }
23        }
24
25        // must start with 1 and end with 1 and have exactly 2 changes
26        return list.get(0) == 1 && list.get(list.size() - 1) == 1 && changes == 2;
27    }
28}
29