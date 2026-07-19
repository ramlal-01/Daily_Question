// Last updated: 19/7/2026, 9:49:30 pm
1class Solution {
2public:
3    int maxSubArray(vector<int>& nums) {
4        int n = nums.size() ;
5        int sum = 0 ;
6        int maxi = INT_MIN ;
7        for( int ele : nums ){
8            sum = sum+ele ;
9            maxi = max( sum , maxi ) ;
10            if( sum<0) sum = 0 ;
11        }
12        return maxi ;
13    }
14};