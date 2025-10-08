// Last updated: 8/10/2025, 8:40:34 am
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length ; 
        int extra = additionalRocks;
        int need[] = new int[n];

        for( int i = 0 ; i<n ; i++){
            need[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(need);
        int c =0 ; 
        for( int i = 0 ; i<n ; i++){
            if( need[i] == 0) c++;
            else if( extra >= need[i] ){
                extra -= need[i];
                c++;
            } else {
                break;  
            }
        } 
        return c;
    }
}