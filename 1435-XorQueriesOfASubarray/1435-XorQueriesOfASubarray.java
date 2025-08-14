// Last updated: 14/8/2025, 4:28:19 pm
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int pre[] = new int[arr.length];
        int pref=0;
        for( int i=0 ; i<arr.length; i++){
            pref= pref^ arr[i];
            pre[i]=pref;
        }
        int res[] = new int[queries.length];
        for( int i=0 ; i<queries.length; i++){
            if( queries[i][0]==0){
                res[i]= pre[queries[i][1]];
            }
            else{
                res[i]= pre[queries[i][0]-1]^ pre[queries[i][1]];
            }
        }
        return res;
    }
}