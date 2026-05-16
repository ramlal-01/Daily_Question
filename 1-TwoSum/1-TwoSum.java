// Last updated: 16/5/2026, 1:35:28 pm
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n  = nums.length ;
4        int t = target ; 
5
6        HashMap<Integer,Integer> map = new HashMap<>() ;
7
8        for( int i = 0 ; i<n ; i++ ){
9            if( map.containsKey( target - nums[i]) ){
10                return new int[]{ map.get( target-nums[i] ),i } ;
11            }
12            map.put( nums[i] , i );
13        }
14        return new int[]{} ;
15    }
16}