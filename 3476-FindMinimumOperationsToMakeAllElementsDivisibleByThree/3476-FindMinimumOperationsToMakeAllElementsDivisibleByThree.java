// Last updated: 14/8/2025, 4:25:25 pm
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int ele : nums){
            if(ele%3!=0){
                c++;
            }
        }
        return c;
    }
}