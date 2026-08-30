// Last updated: 30/8/2026, 10:03:20 pm
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int n = nums.length ;
4        if( n==1) return 1 ;
5        int mini = Integer.MAX_VALUE ;
6        int maxi = Integer.MIN_VALUE ;
7        int ind1 = -1 ;
8        int ind2 = -1 ; 
9        for( int i = 0 ; i<n ; i++ ){
10            if( nums[i]>maxi ){
11                maxi = nums[i] ;
12                ind1 = i ;
13            }
14            if( nums[i]<mini ){
15                mini = nums[i] ;
16                ind2 = i ;
17            }
18        }
19        
20        int left = Math.max(ind1, ind2) + 1;
21        int right = n - Math.min(ind1, ind2);
22
23        int both = Math.min(ind1, ind2) + 1
24                + n - Math.max(ind1, ind2);
25
26        return Math.min(left, Math.min(right, both));
27        
28        
29        
30    }
31}