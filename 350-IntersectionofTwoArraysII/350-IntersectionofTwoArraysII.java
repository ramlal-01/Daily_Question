// Last updated: 11/3/2026, 2:45:34 pm
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        int n = nums1.length ;
4        int m = nums2.length ;
5
6        Arrays.sort(nums1);
7        Arrays.sort(nums2);
8        int i = 0 ;
9        int j = 0 ;
10
11        List<Integer> list = new ArrayList<>() ;
12        while( i<n && j<m ){
13            if( nums1[i]==nums2[j] ){
14                list.add(nums1[i]) ;
15                i++;
16                j++;
17            }
18            else if( nums1[i]<nums2[j] ){
19                i++;
20            }
21            else j++;
22        }
23        int[] arr = new int[list.size()];
24        for(int k = 0; k < list.size(); k++){
25            arr[k] = list.get(k);
26        }
27        return arr;
28    }
29}