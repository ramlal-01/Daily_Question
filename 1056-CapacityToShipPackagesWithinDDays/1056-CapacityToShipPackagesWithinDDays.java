// Last updated: 14/8/2025, 4:28:50 pm
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for( int ele: weights){
            low= Math.max( ele, low);
            high+=ele;
        }
        int ans=0;
        while( low<=high){
            int mid = low+(high-low)/2;
            if( possible( weights, days, mid )){
                
                high = mid-1;
            }
            else{
                low= mid+1;
            }

        }
        return low;

    }

    public boolean possible( int arr[] , int days , int req){
        int sum=0;
        int c=1;
        for( int ele : arr){
            sum+=ele;
            if(sum> req){
                sum=0;
                sum= ele;
                c++;
            }
        }
        return c<=days;
    }
    
}