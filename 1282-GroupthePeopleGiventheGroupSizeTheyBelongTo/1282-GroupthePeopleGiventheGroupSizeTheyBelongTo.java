// Last updated: 8/12/2025, 9:18:04 pm
1class Solution {
2    public List<List<Integer>> groupThePeople(int[] groupSizes) {
3        Map<Integer, List<Integer>> map = new HashMap<>();
4        List<List<Integer>> res = new ArrayList<>();
5
6        for (int i = 0; i < groupSizes.length; i++) {
7            int size = groupSizes[i];
8
9            map.putIfAbsent(size, new ArrayList<>());
10            map.get(size).add(i);
11
12            if (map.get(size).size() == size) {
13                res.add(new ArrayList<>(map.get(size)));
14                map.get(size).clear();
15            }
16        }
17
18        return res;
19    }
20}
21