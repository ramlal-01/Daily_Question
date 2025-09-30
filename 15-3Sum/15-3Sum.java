// Last updated: 30/9/2025, 12:28:37 pm
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int k = 0; k < n - 2; k++) {
            if (k > 0 && nums[k] == nums[k - 1]) continue;  

            int i = k + 1, j = n - 1;

            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    i++;
                    j--;

                    while (i < j && nums[i] == nums[i - 1]) i++; 
                    while (i < j && nums[j] == nums[j + 1]) j--;
                } else if (sum < 0) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return res;
    }
}
