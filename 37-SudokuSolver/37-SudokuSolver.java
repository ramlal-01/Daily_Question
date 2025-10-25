// Last updated: 26/10/2025, 1:13:26 am
class Solution {
    public void solveSudoku(char[][] board) {
        helper( board , 0 , 0 );

    }

    public boolean helper( char[][] board , int row , int col ){
        
        int nextrow = row , nextcol = col+1 ;
        if( nextrow==9){
            return true ;
        }
        if( nextcol==9) {
            nextrow = row+1 ;
            nextcol = 0;
        }

        

        if( board[row][col]!='.'){
            return helper( board , nextrow , nextcol);
        } 

        for( char i = '1' ; i<='9' ; i++){
            if( isSafe( board, row , col , i)){
                board[row][col] = i;
                if( helper( board , nextrow , nextcol ) ) {
                    return true ;
                }
                board[row][col] = '.';
            }
        }

        return false ;
    }

    public boolean isSafe( char[][] board , int row , int col , char val){
        int r = row ;
        int c = col ;

        for( int i =0 ; i<9 ;i++){
            if( board[r][i] == val ){
                return false;
            }
        }

        for( int i =0 ; i<9 ;i++){
            if( board[i][c] == val ){
                return false;
            }
        }

        int srow = (row/3)*3 ;
        int scol = (col/3)*3;

        for( int i = srow ; i<=srow+2 ; i++){
            for( int j = scol ; j<=scol+2 ; j++){
                if( board[i][j]==val){
                    return false ;
                }
            }
        }
        return true ;

    }
}