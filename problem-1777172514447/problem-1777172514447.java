// Last updated: 26/4/2026, 8:31:54 am
1class Solution {
2    public List<Integer> findValidElements(int[] nums) {
3        List<Integer> list = new ArrayList<>() ;
4        int n = nums.length ;
5
6        list.add(nums[0]) ;
7
8        for( int i =1 ; i<n-1 ; i++ ){
9            boolean flag = true ;
10            for( int j = 0 ; j<i ; j++ ){
11                if( nums[j]>=nums[i] ){
12                    flag = false ;
13                }
14            }
15            boolean flag1 = true ;
16            for( int j = i+1 ; j<n ; j++ ){
17                if( nums[j]>=nums[i] ){
18                    flag1 = false ;
19                }
20            }
21            if( flag || flag1 ){
22                list.add(nums[i]) ;
23            }
24        }
25        if( n>1) list.add( nums[n-1]);
26        return list ;
27    }
28}