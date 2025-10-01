// Last updated: 1/10/2025, 11:07:37 am
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
        int temp = arr[n-1];
        arr[n-1] = 1;
        for( int i = n -2 ;i>=0 ; i--){
            if( ratings[i]> ratings[i+1]){
                arr[i] = Math.max(arr[i] , arr[i+1] + 1);
            }
            // else{
            //     arr[i] = Math.max( arr[i]) ;
            // }
        }
        int c= 0 ;
        for( int i =0 ;i<n-1 ; i++){
            c+= arr[i];
        }
        c+= Math.max( arr[n-1], temp);
        return c;
    }
} 