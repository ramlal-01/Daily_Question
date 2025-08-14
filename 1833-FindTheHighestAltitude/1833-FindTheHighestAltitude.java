// Last updated: 14/8/2025, 4:27:48 pm
class Solution {
    public int largestAltitude(int[] gain) {
        int prefix[]= new int[gain.length+1];
        prefix[0]=0;

        for(int i=1; i<prefix.length;i++){
            prefix[i]= prefix[i-1]+ gain[i-1];
        }

        int max=prefix[0];
        for( int i=1; i<prefix.length; i++){
            max= Math.max(max, prefix[i]);
        }
        return max;
    }
}