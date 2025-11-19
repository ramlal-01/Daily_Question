// Last updated: 19/11/2025, 9:22:33 pm
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length ;
        int[] arr = new int[n*2];

        for( int i = 0 ; i<n ; i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
    }
}