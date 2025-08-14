// Last updated: 14/8/2025, 4:28:55 pm
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)
                nums[i]=nums[i]*-1;
        }
        for(int ele:nums){
            System.out.println(ele);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        return nums;
    }
}