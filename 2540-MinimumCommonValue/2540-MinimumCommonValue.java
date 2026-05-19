// Last updated: 19/5/2026, 10:52:09 pm
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        int n1 = nums1.length ;
4        int n2 = nums2.length ;
5
6        int i = 0;
7        int j = 0 ;
8
9        while( i<n1 && j<n2 ){
10            if( nums1[i]==nums2[j] ){
11                return nums1[i];
12            }
13
14            else if( nums1[i]< nums2[j]){
15                i++;
16            }
17            else j++;
18        }
19
20        return -1 ;
21    }
22}