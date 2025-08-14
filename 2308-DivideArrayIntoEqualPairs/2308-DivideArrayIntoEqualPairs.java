// Last updated: 14/8/2025, 4:26:47 pm
class Solution {
    public boolean divideArray(int[] nums) {
        
        int map[] = new int[ 501];

        for( int ele : nums){
            map[ele]++;
        }

        for( int ele : map){
            if( ele%2!=0) return false;
        }
        return true;
    }
}