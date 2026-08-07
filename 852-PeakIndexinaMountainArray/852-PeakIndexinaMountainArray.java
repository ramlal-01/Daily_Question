// Last updated: 7/8/2026, 2:31:52 pm
1class Solution {
2    public int peakIndexInMountainArray(int[] nums) {
3        int n = nums.length ; 
4        int low = 0 ;
5        int high = n-1 ;
6          
7        while( low < high ){
8            int mid = low + (high-low)/2 ;
9
10    
11            
12
13            if( nums[mid+1]>nums[mid] ){
14                low = mid+1 ;
15            }
16            else {
17                high = mid ;
18            }
19        }
20        return low ;
21    }
22}