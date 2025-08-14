// Last updated: 14/8/2025, 4:28:22 pm
class Solution {
    public int findNumbers(int[] nums) {
        int f=0;
        for( int ele: nums){
            int c=0;
            while(ele>0){
                c++;
                ele/=10;
            }
            if( c%2==0){
                f++;
            }
        }
        return f;
    }
}