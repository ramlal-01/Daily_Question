// Last updated: 19/7/2026, 9:59:24 pm
1class Solution {
2public:
3    int majorityElement(vector<int>& nums) {
4        int n = nums.size() ;
5
6        unordered_map<int,int> map ;
7
8        for( int ele : nums ){
9            map[ele]++;
10        }
11
12        for( auto &ele : map ){
13            if( ele.second>(n/2) ){
14                return ele.first ;
15            }
16        }
17        return -1 ;
18    }
19};