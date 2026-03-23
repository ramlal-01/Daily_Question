// Last updated: 23/3/2026, 2:15:19 pm
1class Solution {
2    public int rob(int[] nums) {
3        if(nums.length<2)return nums[0];
4
5        int arr[] = new int[nums.length];
6
7        arr[0] = nums[0];
8        arr[1] = Math.max( nums[0], nums[1]);
9
10        for( int i=2 ; i<arr.length; i++){
11            arr[i] = Math.max( (arr[i-2]+nums[i]) , arr[i-1]);
12        }
13        
14        return arr[arr.length-1];
15    }
16}
17
18