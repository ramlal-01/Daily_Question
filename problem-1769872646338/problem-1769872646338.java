// Last updated: 31/1/2026, 8:47:26 pm
1class Solution {
2    public int minimumK(int[] nums) {
3        int low = 1 ;
4        int high = 100000;
5
6        int n = nums.length ;
7        // int i = 0 ; 
8        // while( i<n ){
9        //     high +=nums[i];
10        //     i++;
11        // }
12        
13        while( low<high){
14            int k = low+(high-low)/2;
15            long cnt = count(nums,k);
16            if( cnt<= (long) k*k ) high = k ;
17            else low = k+1 ;
18        }
19
20        return low;
21    }
22
23    public long count(int[] nums , int k ){
24        long cnt = 0 ;
25        for( int ele : nums ){
26            cnt+= ( ele+k-1)/k;
27        }
28        return cnt ;
29    }
30}