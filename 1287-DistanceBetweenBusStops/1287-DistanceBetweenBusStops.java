// Last updated: 14/8/2025, 4:28:33 pm
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum=0;
        for( int i=0;i<distance.length ; i++){
            sum+=distance[i];
        }
        int s=0;
        if( start< destination){
            while(start<destination){
                s+=distance[start];
                start++;
            }
        }
        else{
            while(start>destination){
                s+=distance[start-1];
                start--;
            }
        }
        return Math.min( sum-s, s);
    }
}