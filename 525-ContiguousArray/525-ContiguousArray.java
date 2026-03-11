// Last updated: 11/3/2026, 4:04:47 pm
1class Solution {
2    public int findMaxLength(int[] nums) {
3        int n = nums.length ;
4        for( int i =0 ; i<n ; i++ ){
5            if( nums[i]==0) nums[i]=-1 ;
6        }
7
8        int sum = 0 ;
9        Map<Integer,Integer> map = new HashMap<>() ;
10        int ans = 0 ;
11        map.put( 0 , -1 );
12        for( int i=0; i<n ;i++ ){
13            sum+= nums[i] ;
14            if( map.containsKey(sum) ){
15                ans = Math.max( ans , i-map.get(sum) );
16            }else map.put( sum , i );
17        }
18        return ans ;
19    }
20}