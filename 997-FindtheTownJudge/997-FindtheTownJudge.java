// Last updated: 27/9/2025, 6:58:37 am
class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] map = new int[n+1];

        for( int i = 0 ; i<trust.length ; i++){ 
            map[trust[i][0]]--;
            map[trust[i][1]]++;
        }
        
        for(  int i = 1 ; i<n+1 ; i++){
            if( map[i]==n-1){
               return i;
            }

        } 
        return -1 ;
    }
}