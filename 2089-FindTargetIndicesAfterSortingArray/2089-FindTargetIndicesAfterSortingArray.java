// Last updated: 19/10/2026, 11:25:54 am
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        ArrayList<Integer> res = new ArrayList<>();
4        Arrays.sort(nums);
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==target){
7                res.add(i);
8            }
9        }
10        return res;
11    }
12}