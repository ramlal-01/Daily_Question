// Last updated: 12/10/2025, 5:51:27 pm
class Solution {
    int count = 0 ;
    public int totalNQueens(int n) {
        int board[][] = new int[n][n];

        int row = 0 ;
        int col = 0 ;

        helper( board , col , n);

        return count ;
    }

    public void helper( int[][] board , int col , int n ){
        if( col == n){
            count++ ;
            return ;
        }

        for( int row = 0 ; row<n ; row ++){
            if( isSafe( row , col , board , n )){
                board[row][col] = 1 ;
                helper( board , col+1 , n);
                board[row][col] = 0 ;
            }
        }
    }

    public boolean isSafe( int row , int col , int[][] board , int n){
        int r = row ;
        int c = col ;

        while( r>=0 && c>=0){
            if( board[r][c]==1){
                return false ;
            }
            r--;
            c--;
        }
 
        r = row ;
        c = col;

        while(c>=0){
            if( board[r][c]==1){
                return false ;
            }
            c--;
        }

        r = row ;
        c = col ;

        while( r<n && c>=0){
            if( board[r][c]==1){
                return false ;
            }
            r++;
            c--;
        }
        return true;
    }
}