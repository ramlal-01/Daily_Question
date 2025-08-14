// Last updated: 14/8/2025, 4:27:23 pm
class Solution {
    public int[] buildArray(int[] nums) {
        int arr[]= new int[nums.length];
        int k=0;
        for( int ele: nums){
            arr[k++]=nums[ele];
        }
        return arr;
    }
}