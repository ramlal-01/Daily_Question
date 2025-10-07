// Last updated: 7/10/2025, 6:54:12 am
class Solution {
    int count  = 0 ;
    public int countArrangement(int n) { 
        boolean arr[] = new boolean[n+1];
        helper( n , arr , 1);
        
        // System.out.println(res);
        return count;
    }

    public void helper( int n  , boolean[] arr , int ind ){
        if(  ind>n){
            count++;
            return ;
        }
        

        for( int i = 1 ; i<=n ; i++){
            if( arr[i]) continue ;

            arr[i] = true ; 

            if( i% ind==0 || ind%i==0 ){ 
                helper( n , arr , ind+1); 
            }
            arr[i] = false;
        }
    }
}