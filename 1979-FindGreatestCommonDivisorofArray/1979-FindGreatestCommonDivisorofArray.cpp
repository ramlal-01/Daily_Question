// Last updated: 18/7/2026, 2:41:01 pm
1class Solution {
2public:
3    int findGCD(vector<int>& nums) {
4        sort( nums.begin() , nums.end() ) ;
5
6        int a = nums[0] ;
7        int b = nums[nums.size()-1] ;
8
9        while( a>0 ){
10            int rem = b%a ;
11            b = a ;
12            a = rem ;
13        }
14
15        return b ;
16    }
17};