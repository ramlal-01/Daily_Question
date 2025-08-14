// Last updated: 14/8/2025, 4:26:05 pm
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low =1;
        long high =0;
        for( int ele: ranks){
            high = Math.max( high , ele);
        }
        high = high * (long) cars * cars;
        long ans =0;
        while( low<=high){
            long mid = low+(high-low)/2;

            if( poss( ranks, mid , cars)){
                ans = mid;
                high = mid-1;
            }
            else low= mid+1;
        }
        return ans;
    }

    public boolean poss( int arr[] , long mid , int cars){
        long count =0;
        for( long ele : arr){
            count+= (long) Math.sqrt( mid/ele);
        }
        return count>= cars;
    }
}