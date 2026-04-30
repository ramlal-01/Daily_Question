// Last updated: 30/4/2026, 9:22:01 pm
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n = nums.length ;
4
5        HashMap<Integer,Integer> map = new HashMap<>() ;
6        int ans[] = new int[2] ;
7
8        for( int i =0 ; i<n ; i++ ){
9            if( map.containsKey(target-nums[i])){
10                ans[0]= map.get(target-nums[i]);
11                ans[1] = i ;
12                break;
13            }
14            map.put( nums[i] , i );
15        }
16        return ans ;
17    }
18}