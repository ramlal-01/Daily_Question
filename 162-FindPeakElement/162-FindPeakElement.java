// Last updated: 12/10/2026, 10:59:41 pm
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int n = nums.length ; 
4        int low = 0 ;
5        int high = n-1 ;
6          
7        while( low < high ){
8            int mid = low + (high-low)/2 ;
9
10            if( nums[mid+1]>nums[mid] ){
11                low = mid+1 ;
12            }
13            else {
14                high = mid ;
15            }
16        }
17        return low ;
18    }
19}