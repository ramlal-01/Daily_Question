// Last updated: 12/12/2025, 12:16:07 pm
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n = nums.length ;
4
5        int res[] = new int[2] ;
6
7        Map<Integer,Integer> map = new HashMap<>();
8
9        for( int i = 0 ; i<n ; i++ ){
10            if( map.containsKey( target-nums[i] ) ){
11                res[0] = i;
12                res[1] = map.get( target-nums[i] ); 
13            }
14            map.put( nums[i]  , i );
15        }
16        return res ;
17    }
18}