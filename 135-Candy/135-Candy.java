// Last updated: 1/10/2025, 10:49:18 am
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int arr[] = new int[n];
        arr[0] = 1 ;
        for( int i =1 ; i< ratings.length ; i++){
            if( ratings[i]> ratings[i-1]){
                arr[i]= arr[i-1]+1 ;
            }
            else{
                arr[i] = 1 ;
            }
        }

        int arr2[] = new int[n];

        arr2[n-1] = 1 ;

        for( int i = n -2 ;i>=0 ; i--){
            if( ratings[i]> ratings[i+1]){
                arr2[i] = arr2[i+1] + 1;
            }
            else{
                arr2[i] = 1 ;
            }
        }
        int c= 0 ;
        for( int i =0 ;i<n ; i++){
            c+= Math.max( arr[i] , arr2[i]);
        }
        return c;
    }
} 