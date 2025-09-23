// Last updated: 23/9/2025, 6:31:34 am
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum =0 , rsum = 0 , max = 0 ;

        for( int i =0 ; i<k ; i++){
            lsum += cardPoints[i];
        }

        max = lsum ;

        int rind = cardPoints.length -1 ;

        for( int i= k-1 ; i>=0 ; i--){
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rind];
            max = Math.max( max , lsum + rsum );
            rind--;
        }
        return max;
    }
}