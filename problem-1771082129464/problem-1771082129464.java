// Last updated: 14/2/2026, 8:45:29 pm
1class Solution {
2    public long rob(int[] nums, int[] colors) {
3        int n = nums.length ; 
4
5        long notrob = 0 ;
6        long rob = nums[0];
7        int i = 1 ;
8        while( i<n ){
9            long crob ;
10            long cnotrob = Math.max( notrob , rob);
11            
12
13            if( colors[i] != colors[i-1]){
14                crob = nums[i] + Math.max( notrob , rob );
15                
16            }
17            else{
18                crob = nums[i] + notrob ;
19            }
20
21            notrob = cnotrob ;
22            rob = crob ;
23            i++;
24        }
25
26        return Math.max( notrob , rob);
27    }
28}