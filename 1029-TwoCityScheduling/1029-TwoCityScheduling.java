// Last updated: 22/3/2026, 10:48:42 pm
1class Solution {
2    public int twoCitySchedCost(int[][] costs) {
3        int n = costs.length ;
4
5        int arr[][] = new int[n][2] ;
6
7        for( int i=0 ; i<n ; i++ ){
8            arr[i][0] = i ;
9            arr[i][1] = costs[i][0] - costs[i][1] ;
10        }
11        Arrays.sort( arr, (a,b)-> a[1]-b[1] );
12
13        int ans = 0 ;
14
15        for( int i =0 ; i<n/2 ; i++ ){
16            ans+= costs[arr[i][0]][0] ;
17        }
18
19        for( int i = n/2 ; i<n ;i++){
20            ans+= costs[arr[i][0]][1] ;
21        }
22        return ans ;
23    }
24}