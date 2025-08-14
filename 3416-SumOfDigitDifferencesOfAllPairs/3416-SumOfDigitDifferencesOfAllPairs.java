// Last updated: 14/8/2025, 4:25:34 pm
class Solution {
    public long sumDigitDifferences(int[] nums) {
        int digitsCount = (int)Math.floor(Math.log10(nums[0]) + 1);
        long[][] map = new long[digitsCount][10];

        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int idx = digitsCount-1;
            while(n > 0){
                int digit = n % 10;
                map[idx--][digit]++;
                n/=10;
            }
        }

        long count = 0;

        for(int i=0;i<digitsCount;i++){
            for(int j=0;j<=9;j++){
                count+=(map[i][j] * (nums.length - map[i][j]));
            }
        }

        return count/2;
    }
}