// Last updated: 19/11/2025, 10:54:35 pm
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        List<List<Integer>> list = new ArrayList<>();
        int n = mat.length ;
        int m = mat[0].length ;

        for( int k = 1 ; k<m ; k++){
            int i = 0 , j=k;
            List<Integer> arr = new ArrayList<>();
            while( (i < n && j < m)){
                arr.add( mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(arr);
            list.add(arr);
        }

        for( int k = 1 ; k<m ; k++){
            int i = 0 , j=k;
            int p = 0 ;
            while( (i < n && j < m)){
                mat[i][j] = list.get(k-1).get(p++);
                i++;
                j++;
            }
        }


        // now the bottom left 
        List<List<Integer>> list3 = new ArrayList<>();

        for( int k = 0 ; k<n ; k++){
            int i = k , j=0;
            List<Integer> arr1 = new ArrayList<>();
            while((i < n && j < m)){
                arr1.add( mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(arr1);
            list3.add(arr1);
        }

        for( int k = 0 ; k<n ; k++){
            int i = k , j=0;
            int p = 0 ;
            while( (i < n && j < m )){
                mat[i][j] = list3.get(k).get(p++);
                i++;
                j++;
            }
        }
        return mat;
    }
}