// Last updated: 14/12/2025, 8:10:36 am
1class Solution {
2    public int absDifference(int[] nums, int k) {
3        Arrays.sort( nums );
4
5        int sum1 = 0 , sum2 =0 ;
6        int a = k;
7        int p = nums.length-1 ;
8        while( k-->0){
9            sum1+= nums[p--];
10        }
11
12        p = 0;
13        while( a-->0){
14            sum2+= nums[p++];
15        }
16        
17        // System.out.println( sum1+" "+sum2);
18        return Math.abs( sum1-sum2);
19    }
20}