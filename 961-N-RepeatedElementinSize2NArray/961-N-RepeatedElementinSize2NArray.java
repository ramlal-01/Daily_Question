// Last updated: 2/1/2026, 8:16:30 am
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        Set<Integer> s = new HashSet<>();
4        for(int i:nums)
5        {
6            if(!s.add(i))
7              return i;
8        }
9        return nums[nums.length-1];
10    }
11}