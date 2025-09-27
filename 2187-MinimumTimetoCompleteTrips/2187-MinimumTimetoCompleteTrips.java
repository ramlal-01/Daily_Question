// Last updated: 27/9/2025, 7:37:22 am
class Solution {
    public boolean isPossible( int[] time , int t , long mid){
        long hours = 0 ;
        for( int ele : time){
            hours+= (int)(mid/(long)ele);

            if( hours >= t ) return true ;
        }

        return false;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long low = 1;
        long high = Integer.MAX_VALUE ;

        for( int ele : time){
            high = Math.min( high , ele);
        }
        high = high * totalTrips;
        while( low<=high){
            long mid = low+ (high - low)/2;

            if( isPossible( time , totalTrips , mid)){
                high = mid -1 ;
            }
            else{
                low = mid+ 1 ;
            }
        }
        return low ;
    }
}