// Last updated: 14/8/2025, 4:26:17 pm
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row[]= new int[grid.length];
        int col[]= new int[grid[0].length];

        int rows=grid.length;
        int cols=grid[0].length;

        for( int i=0; i<rows; i++){
            int c=0;
            for( int j=0; j<cols; j++){
                if( grid[i][j]==1){
                    c++;
                }
            }
            row[i]=c;
        }
        for( int i=0; i<cols; i++){
            int c=0;
            for( int j=0; j<rows; j++){
                if( grid[j][i]==1){
                    c++;
                }
            }
            col[i]=c;
        }
        
        for( int i=0; i<rows; i++){
            int sum=0;
            for( int j=0; j<cols; j++){
                sum= row[i]+col[j]- ( rows-row[i]) - ( cols-col[j]);

                grid[i][j]=sum;
            }
            
        }
        return grid;
    }
}