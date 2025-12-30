// Last updated: 30/12/2025, 12:41:05 pm
class Solution {
    int area=1;
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0)
        return 0;

        int maxarea=0;int area=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                area=dfs(grid,i,j);
                maxarea=Math.max(maxarea,area);
            }
        }
        return maxarea;
    }
    public int dfs(int grid[][],int row,int col)
    {
        if(row<0||row>=grid.length||col<0||col>=grid[0].length||grid[row][col]==0)
        return 0;

        grid[row][col]=0;
        area=1;

        area=area+dfs(grid,row-1,col);
        area=area+dfs(grid,row+1,col);
        area=area+dfs(grid,row,col-1);
        area=area+dfs(grid,row,col+1);

        return area;
    }
}