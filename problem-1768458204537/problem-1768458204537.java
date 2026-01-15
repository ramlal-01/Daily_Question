// Last updated: 15/1/2026, 11:53:24 am
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        return atmostk( nums , k ) - atmostk( nums, k-1) ;
4    }
5
6    public int atmostk( int[] nums , int k ){
7        HashMap<Integer,Integer> map = new HashMap<>() ;
8        int left = 0 ;
9        int count = 0 ;
10        for( int right =0 ; right<nums.length ; right++){
11            map.put( nums[right] , map.getOrDefault(nums[right],0)+1 );
12
13            while( map.size() > k ){
14                map.put( nums[left] , map.get(nums[left])-1 );
15
16                if( map.get( nums[left]) == 0 ){
17                    map.remove( nums[left] );
18                }
19                left++;
20            }
21            count+= right-left+1 ;
22        }
23        return count;
24    }
25}