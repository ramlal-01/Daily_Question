// Last updated: 25/8/2026, 8:06:13 am
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        Set<Integer> set = new HashSet<>() ;
4        for( int ele : nums ) set.add(ele) ;
5
6        int i = 1 ;
7        while(true){
8            int a = k*i ;
9            if(!set.contains(a)) return a ;
10            i++;
11        }
12
13    }
14}