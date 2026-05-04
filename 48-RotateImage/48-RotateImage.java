// Last updated: 4/5/2026, 9:00:05 am
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n= matrix.length;
4        for(int i=0; i<n;i++){
5            for( int j=i+1; j<n; j++){
6                int temp = matrix[i][j];
7                matrix[i][j]= matrix[j][i];
8                matrix[j][i]= temp;
9            }
10        }
11
12        int start =0;
13        int end = n-1;
14        while ( start< end ){
15            for( int row = 0 ; row < n; row++){
16                int temp = matrix[row][start];
17                matrix[row][start] = matrix[row][end];
18                matrix[row][end]=temp;
19            }
20            start++;
21            end--;
22        }
23    }
24}