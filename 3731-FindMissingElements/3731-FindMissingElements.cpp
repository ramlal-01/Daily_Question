// Last updated: 4/8/2026, 8:53:00 pm
1class Solution {
2public:
3    vector<int> findMissingElements(vector<int>& nums) {
4        int n = nums.size() ;
5
6        int maxi= INT_MIN ;
7        int mini = INT_MAX ;
8        vector<int> list ;
9        unordered_set<int> set ; 
10        for( int ele : nums  ){
11            maxi = max( maxi , ele ) ;
12            mini = min( mini , ele ) ;
13            set.insert(ele);
14        }
15
16        for( int i = mini ; i<=maxi ; i++ ){
17            if( !set.contains(i)) list.push_back(i) ;
18        }
19
20        return list ;
21
22    }
23};