// Last updated: 14/8/2025, 4:27:18 pm
class Solution {
    public int findMiddleIndex(int[] nums) {
        int preleft[] = new int[nums.length];
        int preright[] = new int[nums.length];

        preleft[0]= nums[0];
        for( int i=1; i<nums.length; i++){
            preleft[i]= preleft[i-1]+nums[i];
        }
        preright[nums.length-1]= nums[nums.length-1];
        for( int i=nums.length-2; i>=0; i--){
            preright[i]= preright[i+1]+nums[i];
        }

        for( int i=0;i<nums.length; i++){
            if(preleft[i]==preright[i]){
                return i;
            }
        }
        return -1;
    }
}