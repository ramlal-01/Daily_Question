// Last updated: 29/9/2025, 1:12:30 pm
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0 ;
        for( int i =0 ; i<mat.length ; i++){
            sum += mat[i][i];
        }

        int n = mat.length ; 

        for( int i =0 ; i< mat.length ; i++){
            if( i==( n-i-1)) continue ;
            sum+= mat[i][n-i-1];
        }

        return sum ;
    }
}