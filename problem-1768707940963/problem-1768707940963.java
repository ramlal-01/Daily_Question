// Last updated: 18/1/2026, 9:15:40 am
1class Solution {
2    public int maxCapacity(int[] costs, int[] capacity, int budget) {
3        int n = costs.length ;
4
5        long max = Long.MIN_VALUE ;
6        int arr[][] = new int[n][2];
7        
8        for( int i = 0; i<n ;i++ ){
9            arr[i][0] = costs[i];
10            arr[i][1] = capacity[i];
11            if( (long)costs[i]<budget){
12                max = Math.max( max , capacity[i]);
13            }
14        }
15        Arrays.sort( arr , (a,b)->a[0]-b[0]);
16        int pre[] = new int[n];
17        pre[0] = arr[0][1] ;
18        int k =1;
19        while(k<n) {
20            pre[k] = Math.max( pre[k-1],arr[k][1]);
21            k++;
22        } 
23        int i =0;
24        
25        while(  i<n){
26            int high = budget-arr[i][0]-1 ;
27            if( high<0) break;
28            int ind = helper(arr,i-1,high);
29            if( ind!=-1) max = Math.max(max,(long)arr[i][1]+pre[ind]);
30
31            i++;
32        }
33        if( max == Long.MIN_VALUE) return 0 ;
34        return (int)max ;
35    }
36    public int helper( int arr[][] , int low , int high){
37        int res =-1 ;
38        int l=0;
39        int r = low;
40        while( l<=r){
41            int mid = l+(r-l)/2;
42            if( arr[mid][0]<=high){
43                res=mid;
44                l=mid+1;
45            }
46            else{
47                r= mid-1;
48            }
49        }
50        return res;
51    }
52}