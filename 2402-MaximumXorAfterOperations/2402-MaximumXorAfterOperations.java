// Last updated: 14/8/2025, 4:26:42 pm
class Solution {
    public int maximumXOR(int[] nums) {
        int a=0;
        for( int ele: nums){
            a=a|ele;
        }
        return a;
    }
}