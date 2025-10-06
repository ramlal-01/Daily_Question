// Last updated: 6/10/2025, 3:26:43 pm
class Solution {
    int maxGold = 0 ;
    public int getMaximumGold(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    helper(grid, i, j, 0);
                }
            }
        }
        return maxGold;

    }

    public void helper( int[][] grid , int row , int col , int gold  ){
        if( row<0 || row>= grid.length || col<0 || col>=grid[0].length || grid[row][col]==0){
            return ;
        }
        
        int curr = grid[row][col];
        gold+= curr ;
        maxGold = Math.max( gold , maxGold);

        grid[row][col] = 0;
        helper( grid , row-1 , col , gold);
        helper( grid , row , col+1 , gold);
        helper( grid , row+1 , col , gold);
        helper( grid , row , col-1 , gold);

        grid[row][col] = curr;
    }
}