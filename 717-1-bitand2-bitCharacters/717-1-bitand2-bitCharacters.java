// Last updated: 19/11/2025, 9:10:17 pm
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if( bits.length==1) return true ;
        int n = bits.length ;

        boolean flag = true ;
         
        for( int i = 0 ; i<n ;){
            if( bits[i]==0) {
                i++;
                flag = true ;
            }

            if( i<n-1 ){
                if( (bits[i]==1 && bits[i+1] == 0) || (bits[i]==1 && bits[i+1] == 1) ) {
                i+=2 ;
                flag = false ;
            }
            }
            

        }
        return flag ;
    }
}  