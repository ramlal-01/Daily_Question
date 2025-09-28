// Last updated: 28/9/2025, 8:03:11 am
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; 
        int high=0; 
        for(int ele: piles){
            high= Math.max( high, ele);
        } 
        while( low<= high){
            int mid = low+ (high-low)/2;

            if( hours( piles , h, mid)){
                
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public boolean hours( int piles[] , int h , int mid){
        int t =0;

        for( int ele : piles){ 
            if(t>h){
                return false;
            }
            t+= Math.ceil( (double)ele/mid);
             
        }
        return t<=h;
    }
}