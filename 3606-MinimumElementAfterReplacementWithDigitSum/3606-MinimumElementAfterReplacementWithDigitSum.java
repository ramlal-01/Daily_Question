// Last updated: 14/8/2025, 4:25:15 pm
class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            
            while(nums[i]>0){
                int rem = nums[i]%10;
                sum=sum+rem;
                nums[i]/=10;
            }
            if(min>sum){
                min = sum;
            }
        }
        return min;
    }
}