// Last updated: 27/9/2025, 2:32:28 pm
class Solution {
     
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i = 0 ;
        int j = 0;

        int n1 = nums1.length ;
        int n2 = nums2.length ;

        int arr[] = new int[n1+n2];
        int k =0 ;
        while( i<=n1-1 && j<=n2-1 ){
            if( nums1[i] <= nums2[j] ){
                arr[k++] = nums1[i];
                i++;
            }
            else{
                arr[k++] = nums2[j];
                j++;
            }
        }

        if( i<n1){
            for( int l = i ; l<n1 ; l++){
                arr[k++] = nums1[l];
            }
        }

        if( j<n2){
            for( int l = j ; l<n2 ; l++){
                arr[k++] = nums2[l];
            }
        } 

        int n = arr.length ;
        if(n%2!=0) return (double)arr[n/2];

        return  (double)(arr[n/2] + arr[n/2-1] )/2; 
    }
}