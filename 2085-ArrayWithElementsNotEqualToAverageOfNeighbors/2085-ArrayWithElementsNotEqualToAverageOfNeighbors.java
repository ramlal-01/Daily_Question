// Last updated: 14/8/2025, 4:27:20 pm
class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);  // Sorting to get the correct median
        
        int n = nums.length;
        int[] res = new int[n];

        int left = 0;             
        int right = (n + 1) / 2;  
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                res[i] = nums[left++];
            } else {
                res[i] = nums[right++];
            }
        }
        
        return res;
    }
}