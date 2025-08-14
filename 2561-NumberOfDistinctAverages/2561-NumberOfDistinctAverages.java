// Last updated: 14/8/2025, 4:26:22 pm
class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0,j=nums.length-1;i<nums.length/2;i++,j--){
            set.add( (nums[i]+nums[j])/2.0 );

        } 
        return set.size();
    }
}