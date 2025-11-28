// Last updated: 29/11/2025, 5:00:52 am
1class Solution {
2    public int[][] diagonalSort(int[][] mat) {
3        List<List<Integer>> list = new ArrayList<>();
4        int n = mat.length ;
5        int m = mat[0].length ;
6
7        for( int k = 1 ; k<m ; k++){
8            int i = 0 , j=k;
9            List<Integer> arr = new ArrayList<>();
10            while( (i < n && j < m)){
11                arr.add( mat[i][j]);
12                i++;
13                j++;
14            }
15            Collections.sort(arr);
16            list.add(arr);
17        }
18
19        for( int k = 1 ; k<m ; k++){
20            int i = 0 , j=k;
21            int p = 0 ;
22            while( (i < n && j < m)){
23                mat[i][j] = list.get(k-1).get(p++);
24                i++;
25                j++;
26            }
27        }
28
29
30        // now the bottom left 
31        List<List<Integer>> list3 = new ArrayList<>();
32
33        for( int k = 0 ; k<n ; k++){
34            int i = k , j=0;
35            List<Integer> arr1 = new ArrayList<>();
36            while((i < n && j < m)){
37                arr1.add( mat[i][j]);
38                i++;
39                j++;
40            }
41            Collections.sort(arr1);
42            list3.add(arr1);
43        }
44
45        for( int k = 0 ; k<n ; k++){
46            int i = k , j=0;
47            int p = 0 ;
48            while( (i < n && j < m )){
49                mat[i][j] = list3.get(k).get(p++);
50                i++;
51                j++;
52            }
53        }
54        return mat;
55    }
56}