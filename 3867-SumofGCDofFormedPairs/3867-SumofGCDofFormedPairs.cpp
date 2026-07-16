// Last updated: 16/7/2026, 9:48:24 pm
1class Solution {
2public:
3    long long gcdSum(vector<int>& nums) {
4        int n = nums.size() ;
5        vector<int> pre(n) ; 
6        int i  = 0 ;
7        int maxi = INT_MIN;
8        for( int ele : nums ){
9            maxi = max(ele,maxi) ;
10            pre[i++] = gcd(ele,maxi) ;
11        }
12
13        sort( pre.begin(),pre.end() );
14
15        long long res = 0 ;
16
17        int l = 0 ;
18        int r = n-1 ;
19
20        while(l<r) {
21            res+=gcd( pre[l],pre[r] ) ;
22            l++;
23            r--;
24        }
25
26        return res ;
27    }
28    int gcd(int a, int b) {
29        while (b != 0) {
30            int rem = a % b;
31            a = b;
32            b = rem;
33        }
34        return a;
35    }
36};
37
38