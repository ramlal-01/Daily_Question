// Last updated: 21/7/2026, 11:05:07 pm
1class Solution {
2    int maxi ;
3    int c= 0 ;
4    public int countMaxOrSubsets(int[] nums) {
5        int n = nums.length ;
6        maxi = 0 ;
7        for( int ele : nums ) maxi|=ele ;
8
9        func( 0 , nums , 0 ) ;
10
11        return c ;
12    }
13
14    public void func( int ind , int[] nums , int or ){
15        if( ind==nums.length ){
16            if( or==maxi ) c++ ;
17            return ;
18        }
19
20        func( ind+1 , nums , or|nums[ind] );
21
22        func( ind+1 , nums , or );
23
24    }
25}