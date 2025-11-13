// Last updated: 13/11/2025, 2:51:27 pm
class Solution {
    public int maxOperations(String s) {
        int n = s.length() ;

        int map[] = new int[n];

        if( s.charAt(0) == '1' ) map[0]=1 ;

        for( int i =1 ; i<n ; i++){
            if( s.charAt(i) == '1' ){
                map[i] = map[i-1]+1 ;
            }
            else map[i] = map[i-1];
        }

        int c = 0 ;
        for( int i = 0 ; i<n-1 ; i++){
            if( s.charAt(i)=='0' && s.charAt(i+1) == '1' ){
                c+= map[i];
            }
            System.out.print(map[i]+" ");
        }

        if( s.charAt(n-1)=='0') c+= map[n-1];

        return c ;
    }
}