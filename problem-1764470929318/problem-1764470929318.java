// Last updated: 30/11/2025, 8:18:49 am
1class Solution {
2    public int countElements(int[] nums, int k) {
3        int n= nums.length ;
4        int count = 0 ;
5        Arrays.sort(nums);
6        if( n==1 && k==0){
7            return 1 ;
8        }
9        if( n==1 && k>0){
10            return 0 ;
11        }
12        int i = 0 ;
13        while( i<n ){
14            int ind = firstInd( nums , nums[i] );
15            int rem = n- ind ;
16            if( rem >= k ) count++;
17            i++;
18        }
19        return count;
20    }
21
22    public int firstInd( int[] arr , int x){
23        int low = 0 ;
24        int high = arr.length ;
25        while( low<high){
26            int mid = low+(high-low)/2 ;
27            if( arr[mid] <= x ){
28                low = mid+1 ;
29            }
30            else high = mid ;
31        }
32        return low ;
33    }
34}