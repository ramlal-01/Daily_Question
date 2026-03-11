// Last updated: 11/3/2026, 2:50:18 pm
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        List<Integer> set = new ArrayList<>() ;
4        for( int ele : nums1){
5            set.add(ele);
6        }
7        List<Integer> list = new ArrayList<>() ;
8        for( int ele : nums2 ){
9            if( set.contains(ele) ){
10                list.add(ele);
11                set.remove(Integer.valueOf(ele));
12            }
13        }
14        int[] arr = new int[list.size()];
15        for(int k = 0; k < list.size(); k++){
16            arr[k] = list.get(k);
17        }
18        return arr;
19    }
20}