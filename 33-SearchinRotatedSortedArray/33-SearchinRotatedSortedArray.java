// Last updated: 29/8/2026, 10:41:45 pm
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0 ;
4        int high = nums.length -1 ;
5
6        while( low<= high){
7            int mid = low + ( high - low)/2 ;
8
9            if( nums[mid] == target ) return mid ;
10
11            else if ( nums[low] <= nums[mid]){
12                if( nums[low]<=target && target<= nums[mid]){
13                    high = mid- 1;
14                }
15                else{
16                    low = mid+1 ;
17                }
18            }
19            else{
20                if( nums[mid]<=target && target<=nums[high]){
21                    low = mid+1 ;
22                }
23                else{
24                    high = mid-1 ;
25                }
26            }
27        }
28        return -1 ;
29    }
30}