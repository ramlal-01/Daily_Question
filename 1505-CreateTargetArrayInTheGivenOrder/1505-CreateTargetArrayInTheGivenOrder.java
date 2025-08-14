// Last updated: 14/8/2025, 4:28:14 pm
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (index[i] < i) {
                for (int j = arr.length - 1; j > index[i]; j--) {
                    arr[j] = arr[j - 1];
                }
            }
            arr[index[i]] = nums[i];
        }
        return arr;
    }
}