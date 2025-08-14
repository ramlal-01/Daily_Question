// Last updated: 14/8/2025, 4:28:00 pm
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low= 1;
        int high = position[position.length-1]-position[0];
        int res=0;
        while( low<= high){
            int mid = low+(high-low)/2;
            if( possible( position, m, mid)){
                res= mid;
                low=mid+1;
            }
            else high = mid-1;
        }
        return res;
    }

    public boolean possible( int pos[] ,int m , int mid ){
        int prev = pos[0];
        int c=1;
        for( int i=1; i<pos.length ; i++){
            int curr= pos[i];
            if( curr-prev >= mid){
                c++;
                prev =curr;
            }

            if( c==m){
                break;
            }
        }
        return c==m;
    }
}
