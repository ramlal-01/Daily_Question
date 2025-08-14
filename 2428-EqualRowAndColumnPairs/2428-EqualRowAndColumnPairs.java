// Last updated: 14/8/2025, 4:26:41 pm
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
         
        int count=0;
        for( int r = 0; r<n ; r++ ){
            for( int c = 0 ; c<n ; c++){
                boolean flag = true;
                for( int i = 0 ; i<n ; i++){
                    if( grid[r][i]!=grid[i][c]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    count++;
                }
            }
        }
        return count; 
    }
}