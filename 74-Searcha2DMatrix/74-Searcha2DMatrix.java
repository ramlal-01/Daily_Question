// Last updated: 29/9/2025, 8:31:24 pm
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = 0;
        int h = rows*cols-1;
        while( l<=h){
            int mid = l+( h-l)/2;
            int row = mid/cols;
            int col = mid%cols;
            if( matrix[row][col]== target){
                return true;
            }
            else if( matrix[row][col]> target){
                h= mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return false;
    }
}