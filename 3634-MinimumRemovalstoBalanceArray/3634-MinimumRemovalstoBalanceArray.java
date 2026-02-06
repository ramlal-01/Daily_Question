// Last updated: 6/2/2026, 8:50:01 am
1class Solution {
2    public int minRemoval(int[] nums, int k) {
3        int n = nums.length ;
4
5        int l = 0 ;
6        int len = 0 ;
7        Arrays.sort(nums);
8        for( int r = 0 ; r<n ; r++ ){
9            while((long) nums[r] > (long) k * nums[l] ){
10                l++;
11            }
12
13            len = Math.max( len , r-l+1);
14        }
15
16        return n-len;
17    }
18}