// Last updated: 14/8/2025, 4:25:39 pm
class Solution {
    public int minOperations(int[] nums, int k) {
        int f=0;
        for(int ele: nums){
            if(ele<k){
                f+=1;
            }
        }
        return f;
    }
}