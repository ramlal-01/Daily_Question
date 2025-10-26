// Last updated: 27/10/2025, 12:36:11 am
class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1 ;
        int n = nums.length ;
        for( int i= n-2 ; i>=0 ; i--){
            if( nums[i]<nums[i+1]){
                ind = i;
                break ; 
            }
        }

        if( ind==-1) {
            reverse( nums , 0 , n-1); 
            return ; 
        }
        for ( int i = n-1 ; i>ind ; i--){
            if( nums[i]> nums[ind]){
                swap( nums , i , ind );
                break;
            }
        }

        reverse( nums , ind +1, n-1);

    }  
 
    public static void reverse(int[] arr , int left ,int right) { 

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}