// Last updated: 17/4/2026, 11:09:51 pm
1class Solution {
2    public int minMirrorPairDistance(int[] nums) {
3        int n = nums.length;
4        int mini = Integer.MAX_VALUE ;
5        HashMap<Integer,Integer> map = new HashMap<>();
6        for( int i = 0 ; i<n ; i++ ){
7            if( map.containsKey(nums[i] ) ){
8                mini = Math.min( mini , i- map.get(nums[i]) );
9            }
10            int num = 0 ;
11            int no = nums[i];
12            while( no >0){
13                int rem = no%10 ;
14                num = num*10 + rem ;
15                no=no/10;
16            }
17            map.put( num , i);
18        }
19        return mini== Integer.MAX_VALUE ? -1 : mini ;
20    }
21}