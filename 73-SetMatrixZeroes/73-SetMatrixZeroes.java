// Last updated: 30/9/2025, 7:53:00 am
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length ;
        int n= matrix[0].length ;
        
        int arr[] = {-1};
        for( int i =0 ; i<m ; i++){
            for( int j = 0 ; j<n ; j++){
                 
                if( matrix[i][j]==0){
                    matrix[i][0] = 0 ;

                    if(j!=0) matrix[0][j] = 0 ;
                    else arr[0] =0;
                    
                }
            }
        }
        for( int i = 1 ; i<m ; i++){
            for( int j = 1 ; j<n ; j++){
                if( matrix[i][j]!=0 ) {
                    if( matrix[0][j]==0 || matrix[i][0]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }

        if( matrix[0][0]==0){
            for( int k = 0 ; k<n ; k++){
                matrix[0][k] = 0;
            }
        }

        if( arr[0] == 0){
            for( int k = 0 ; k<m ; k++){
                matrix[k][0] = 0;
            }

        }
    }
}