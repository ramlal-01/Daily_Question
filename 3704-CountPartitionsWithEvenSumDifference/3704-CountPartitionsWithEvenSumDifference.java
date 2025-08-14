// Last updated: 14/8/2025, 4:25:12 pm
class Solution {
    public int countPartitions(int[] nums) {
        int prefix[]= new int[nums.length];
        prefix[0]= nums[0];
        for( int i=1; i<nums.length; i++){
            prefix[i]= prefix[i-1]+nums[i];
        }
        int c=0;
        for( int i=0; i<prefix.length-1; i++){
            int s= prefix[i];
            int sc = prefix[prefix.length-1]- prefix[i];
            if((sc-s)%2==0){
                c++;
            }
        }
        return c;
    }
}