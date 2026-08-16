// Last updated: 16/8/2026, 10:50:38 pm
1class Solution {
2    public int[] twoSum(int[] arr, int target) {
3        int n = arr.length ; 
4
5        Map<Integer,Integer> map = new HashMap<>() ;
6
7        for( int i=0; i<n ; i++ ){
8            int ele = arr[i] ;
9            if( !map.containsKey(target-ele) ){
10                map.put(ele,i+1 ) ;
11            }
12            else{
13                return new int[]{map.get(target-ele),i+1 };
14            }
15        }
16        return new int[]{-1,-1}  ;
17    }
18}