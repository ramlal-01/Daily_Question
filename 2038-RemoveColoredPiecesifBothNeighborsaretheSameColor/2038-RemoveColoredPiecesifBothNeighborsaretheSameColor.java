// Last updated: 8/10/2025, 7:49:43 am
class Solution {
    public boolean winnerOfGame(String colors) {
        int ca = 0 ; 
        int tota = 0 ;
        int cb = 0 ;
        int totb = 0 ;

        for( char s : colors.toCharArray()){
            if( s=='A'){
                ca++; 
                if( cb>=3) totb = totb + (cb-2) ;
                cb=0 ;
            }
            else{
                cb++; 
                if( ca>=3) tota = tota+ (ca-2) ;
                ca=0 ;
            } 
        }
        if( ca>=3) tota = tota + (ca-2) ;
        
        if( cb>=3) totb = totb + (cb-2) ;
        // System.out.println( tota +" "+ totb);
        return tota>totb ;
    }
}