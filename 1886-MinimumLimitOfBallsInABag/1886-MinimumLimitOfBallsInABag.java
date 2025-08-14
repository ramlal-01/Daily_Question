// Last updated: 14/8/2025, 4:27:43 pm
class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1;
        int high = 0;
        for( int ele : nums){
            high = Math.max( high , ele);
        }
        while( low<=high){
            int mid = low+ (high-low)/2;
            if( possible( nums, maxOperations, mid)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    public boolean possible( int nums[] , int max , int mid){
        int c =0;
        for( int ele : nums){
            int co = ele/mid;
            if( ele%mid==0){
                co--;
            }
            c+=co;
            if( c>max){
                return false;
            }
        }
        return true;
    }
}