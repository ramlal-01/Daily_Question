// Last updated: 14/8/2025, 4:26:11 pm
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int s=0;
        for( int ele: nums){
            sum+=ele;

            while(ele>0){
                int rem= ele%10;
                s+=rem;
                ele/=10;
            }
        }
        return Math.abs(sum-s);

        
    }
}