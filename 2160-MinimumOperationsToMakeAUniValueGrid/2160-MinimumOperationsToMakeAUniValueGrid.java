// Last updated: 14/8/2025, 4:27:13 pm
class Solution {
    public int minOperations(int[][] grid, int x) {
        int n= grid.length;
        int m = grid[0].length;
        int arr[] = new int[m*n];
        int k=0;
        int a = grid[0][0]%x;
        for( int i=0; i< n; i++){
            for( int j=0; j<m; j++){
                arr[k++]=grid[i][j];
                if(grid[i][j]%x!=a){
                    return -1;
                }
            }
        }
        Arrays.sort(arr);

        int median  = arr[m*n/2];
        int res =0;
  
        for( int i=0; i<m*n ; i++){
            res+= Math.abs( median - arr[i]);
        }
        return res/x;
    }
}