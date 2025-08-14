// Last updated: 14/8/2025, 4:27:53 pm
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        
        for( int i=0; i<accounts.length; i++){
            int sum=0;
            for( int j=0; j<accounts[0].length; j++){
                sum+=accounts[i][j];
            }
            max=Math.max( sum, max);
        }
        return max;
    }
}