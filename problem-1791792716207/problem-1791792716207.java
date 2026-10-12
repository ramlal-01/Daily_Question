// Last updated: 12/10/2026, 1:41:56 pm
1class Solution {
2    public int maxOperations(int[] nums, int k) {
3        int n = nums.length ;
4
5        int i = 0 ; 
6        int j = n-1 ;
7
8        Arrays.sort(nums) ;
9        int cnt = 0 ;
10
11        while( i<j ){
12            int sum = nums[i]+nums[j]  ;
13            if( sum == k ){
14                cnt++;
15                i++;
16                j--;
17            }
18            else if( sum> k ){
19                j--;
20            }
21            else i++;
22        }
23        return cnt ;
24    }
25}