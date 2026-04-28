// Last updated: 28/4/2026, 9:10:40 pm
1class Solution {
2    public int minOperations(int[][] grid, int x) {
3        int n= grid.length;
4        int m = grid[0].length;
5        int arr[] = new int[m*n];
6        int k=0;
7        int a = grid[0][0]%x;
8        for( int i=0; i< n; i++){
9            for( int j=0; j<m; j++){
10                arr[k++]=grid[i][j];
11                if(grid[i][j]%x!=a){
12                    return -1;
13                }
14            }
15        }
16        Arrays.sort(arr);
17
18        int median  = arr[m*n/2];
19        int res =0;
20  
21        for( int i=0; i<m*n ; i++){
22            res+= Math.abs( median - arr[i]);
23        }
24        return res/x;
25    }
26}