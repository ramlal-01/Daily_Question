// Last updated: 14/8/2025, 4:27:46 pm
class Solution {
    public int sumOfUnique(int[] nums) {
        
        if(nums.length==1){
            return nums[0];
        }
        int max=nums[0];
        for(int ele:nums){
            if(max<ele){
                max=ele;
            }
        }
        int map[]= new int[max+1];
        for(int ele:nums){
            map[ele]++;
        }
        int sum=0;
        for(int i=0;i<map.length;i++){
            if(map[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}