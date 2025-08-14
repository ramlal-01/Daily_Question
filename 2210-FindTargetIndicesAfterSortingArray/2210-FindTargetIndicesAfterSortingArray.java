// Last updated: 14/8/2025, 4:27:09 pm
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res.add(i);
            }
        }
        return res;
    }
}