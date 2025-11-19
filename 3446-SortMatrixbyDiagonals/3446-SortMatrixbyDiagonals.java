// Last updated: 19/11/2025, 10:32:21 pm
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        List<List<Integer>> list = new ArrayList<>();
        int n = grid.length ;

        
        for( int k = 1 ; k<n ; k++){
            int i = 0 , j=k;
            List<Integer> arr = new ArrayList<>();
            while( j<n){
                arr.add( grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(arr);
            list.add(arr);
        }

        for( int k = 1 ; k<n ; k++){
            int i = 0 , j=k;
            int p = 0 ;
            while( j<n){
                grid[i][j] = list.get(k-1).get(p++);
                i++;
                j++;
            }
        }
        ArrayList<Integer> list2 = new ArrayList<>();

        int i=0 , j=0 ;
        while(i<n){
            list2.add(grid[i][j]);
            i++;
            j++;
        }
        Collections.sort(list2, Collections.reverseOrder());

        i=0 ; j=0 ;
        while(i<n){
            grid[i][j] = list2.get(i);
            i++;
            j++;
        }

        // now the bottom left 
        List<List<Integer>> list3 = new ArrayList<>();

        for( int k = 1 ; k<n ; k++){
            i = k ; j=0;
            List<Integer> arr1 = new ArrayList<>();
            while( i<n){
                arr1.add( grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(arr1, Collections.reverseOrder());
            list3.add(arr1);
        }

        for( int k = 1 ; k<n ; k++){
            i = k ; j=0;
            int p = 0 ;
            while( i<n){
                grid[i][j] = list3.get(k-1).get(p++);
                i++;
                j++;
            }
        }
        return grid;

    }
}