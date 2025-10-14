// Last updated: 14/10/2025, 5:08:12 pm
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for( int i =0 ; i<board.length ; i++){
            for( int j = 0 ; j<9 ; j++){
                if( board[i][j]!='.' ){
                    if( !isSafe( board , i , j ) ){
                        return false ;
                    }
                }
            }
        }

        return true ;
    }

    public boolean isSafe( char[][]board , int row , int col ){
        char dig = board[row][col];

        for( int i = 0 ; i<9 ; i++){
            if( i==col) continue ;

            if( board[row][i] == dig ){
                return false ;
            }
        }

        for( int i = 0 ; i<9 ; i++){
            if( i==row) continue ;

            if( board[i][col] == dig ){
                return false ;
            }
        }

        int srow = (row/3)*3;
        int scol = (col/3)*3;
        
        for( int i = srow ; i<= srow+2 ; i++){
            for( int j = scol ; j<= scol+2 ; j++){
                if( i == row && j == col ) continue ;

                if( board[i][j] == dig){
                    return false ;
                }
            }
        }

        return true ;

    }
}