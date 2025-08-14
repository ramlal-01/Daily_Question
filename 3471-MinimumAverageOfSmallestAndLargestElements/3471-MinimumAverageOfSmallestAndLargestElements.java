// Last updated: 14/8/2025, 4:25:28 pm
class Solution {
    public double minimumAverage(int[] nums) {
        HashSet<Double> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0,j=nums.length-1;i<nums.length/2;i++,j--){
            set.add( (nums[i]+nums[j])/2.0 );

        } 
        return Collections.min(set);
    }
}