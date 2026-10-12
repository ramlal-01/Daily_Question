// Last updated: 12/10/2026, 2:59:54 pm
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int preleft[] = new int[nums.length];
4        int preright[] = new int[nums.length];
5
6        preleft[0]= 0 ;
7        for( int i=1; i<nums.length; i++){
8            preleft[i]= preleft[i-1]+nums[i-1];
9        }
10        preright[nums.length-1]= 0;
11        for( int i=nums.length-2; i>=0; i--){
12            preright[i]= preright[i+1]+nums[i+1];
13        }
14
15        for( int i=0;i<nums.length; i++){
16            if(preleft[i]==preright[i]){
17                return i;
18            }
19        }
20        return -1;
21
22    }
23}