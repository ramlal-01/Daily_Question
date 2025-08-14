// Last updated: 14/8/2025, 4:25:37 pm
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for( int ele : nums){
            int max=-1;
            int f=0;
            while( ele>0){
                int rem = ele%10;
                max= Math.max(rem,max);
                ele/=10;
                f++;
            }
            int num=0;
            while(f>0){
                num=num*10+max;
                f--;
            }
            sum+=num;
        }
        return sum;
    }
}