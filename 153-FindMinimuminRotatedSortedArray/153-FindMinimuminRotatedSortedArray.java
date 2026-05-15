// Last updated: 15/5/2026, 2:58:58 pm
1class Solution {
2    public int findMin(int[] nums) {
3        int start=0;
4        int end = nums.length-1;
5        int ans = Integer.MAX_VALUE;
6
7        while(start<=end){
8            int mid = start+(end - start)/2;
9            if( nums[start]<= nums[mid]){
10                ans = Math.min( nums[start],ans);
11                start= mid+1;
12            }
13            else{
14                ans = Math.min( ans, nums[mid]);
15                end = mid-1;
16            }
17        }
18        return ans;            
19    }
20}