// Last updated: 19/10/2026, 1:07:49 am
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                nums[i]*=-1;
            }
        }
        Arrays.sort(nums);

        for(int i=0;i<n/2;i++){
            ans-=nums[i]*nums[i];
        }
        for(int i=n/2;i<n;i++){
            ans+=nums[i]*nums[i];
        }
        return ans;
    }
}