// Last updated: 10/4/2026, 11:41:25 pm
1class Solution {
2     
3    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
4        
5        int i = 0 ;
6        int j = 0;
7
8        int n1 = nums1.length ;
9        int n2 = nums2.length ;
10
11        int arr[] = new int[n1+n2];
12        int k =0 ;
13        while( i<=n1-1 && j<=n2-1 ){
14            if( nums1[i] <= nums2[j] ){
15                arr[k++] = nums1[i];
16                i++;
17            }
18            else{
19                arr[k++] = nums2[j];
20                j++;
21            }
22        }
23
24        if( i<n1){
25            for( int l = i ; l<n1 ; l++){
26                arr[k++] = nums1[l];
27            }
28        }
29
30        if( j<n2){
31            for( int l = j ; l<n2 ; l++){
32                arr[k++] = nums2[l];
33            }
34        } 
35
36        int n = arr.length ;
37        if(n%2!=0) return (double)arr[n/2];
38
39        return  (double)(arr[n/2] + arr[n/2-1] )/2; 
40    }
41}