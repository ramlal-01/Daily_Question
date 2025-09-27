// Last updated: 27/9/2025, 2:29:13 pm
class Solution {
    public int[] merge( int[] arr1 , int[] arr2 ){
        int i = 0 ;
        int j = 0;

        int n1 = arr1.length ;
        int n2 = arr2.length ;

        int ans[] = new int[n1+n2];
        int k =0 ;
        while( i<=n1-1 && j<=n2-1 ){
            if( arr1[i] <= arr2[j] ){
                ans[k++] = arr1[i];
                i++;
            }
            else{
                ans[k++] = arr2[j];
                j++;
            }
        }

        if( i<n1){
            for( int l = i ; l<n1 ; l++){
                ans[k++] = arr1[l];
            }
        }

        if( j<n2){
            for( int l = j ; l<n2 ; l++){
                ans[k++] = arr2[l];
            }
        }
        return ans ;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = merge( nums1 , nums2 );
        int n = arr.length ;
        if(n%2!=0) return (double)arr[n/2];

        return  (double)(arr[n/2] + arr[n/2-1] )/2; 
    }
}