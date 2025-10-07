// Last updated: 7/10/2025, 7:09:50 am
class Solution {
    int count = 0 ;
    int totalempty = 1 ;
    public int uniquePathsIII(int[][] grid) { 

        int sti = 0 , stj = 0 ;
        for( int i =0 ; i<grid.length ; i++){
            for( int j= 0 ; j<grid[0].length ; j++){
                if( grid[i][j] == 0){
                    totalempty++;
                }
                else if( grid[i][j]==1) {
                    sti = i ;
                    stj = j;
                }
            }
        }

        helper( grid , sti , stj   , 0 );

        return count ;

    }

    public void helper( int[][] grid , int row , int col , int total ){
        if( row<0 || row>= grid.length || col<0 || col>=grid[0].length|| grid[row][col]==-1){
            return ;
        }

        if( grid[row][col] == 2 && total==totalempty){
             count++;
             return ;
        }

        if( grid[row][col] == -1){
            return  ;
        } 
        int curr = grid[row][col];
        grid[row][col] = -1;
        helper( grid , row-1 , col  , total+1);
        helper( grid , row , col+1 , total+1);
        helper( grid , row+1 , col , total+1);
        helper( grid , row , col-1  , total+1);
        grid[row][col] = curr ; 

    }
}