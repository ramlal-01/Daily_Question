// Last updated: 12/8/2026, 11:09:36 am
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3 
4        int n =nums.length;
5        int r= 1;
6        int left= 0;
7        HashMap<Integer,Integer> freq =new HashMap<>();
8        for (int right =0; right< n;right++) {
9            int c =nums[right];
10            freq.put(c,freq.getOrDefault(c,0) + 1);
11             
12            while(freq.get(c)> k) {
13                int d= nums[left];
14                freq.put(d,freq.get(d) - 1);
15                left++;
16            }
17            r = Math.max(r,right - left+1);
18        }
19        return r;
20    }
21}