// Last updated: 14/8/2025, 4:28:09 pm
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int k=0;

        for( int i=0,j=n; i<n; i++,j++){
            arr[k++]=nums[i];
            arr[k++]=nums[j];
        }
        return arr;
    }
}