// Last updated: 27/7/2026, 11:35:15 pm
1class Solution {
2public:
3    int maxProduct(vector<int>& nums) {
4        int n = nums.size() ;
5        int maxi = 0 ;
6        int smaxi = 0 ;
7
8        for( int ele : nums ){
9            if( ele>maxi) {
10                smaxi = maxi ;
11                maxi = max(ele,maxi) ;
12                
13            }
14            else if( smaxi<ele ){
15                smaxi = ele ;
16            }
17        }
18        return (maxi-1)*(smaxi-1) ;
19    }
20};