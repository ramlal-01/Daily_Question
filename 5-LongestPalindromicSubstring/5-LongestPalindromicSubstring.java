// Last updated: 3/10/2025, 7:29:19 am
class Solution {
    public int valid( String s , int i , int j , int[][] map){
        if( i>=j){
            return 1 ;
        }

        if( map[i][j]!=-1 ) return map[i][j] ;

        if( s.charAt(i)==s.charAt(j)){
            
            return map[i][j] = valid( s , i+1 , j-1 , map);
        }
        else return map[i][j]=0 ;
    }
    public String longestPalindrome(String s) {
        int n = s.length() ;
        int max= 0 ;
        int ind = 0 ;
        int map[][] = new int[n][n];
        for( int ele[]  : map) Arrays.fill( ele , -1);
        for( int i = 0 ;i<n ; i++){
            for( int j = i ; j< n ; j++){
                if( valid( s , i , j , map)==1){
                    if( j-i+1 > max){
                        max = Math.max( max , j-i+1);
                        ind = i;
                    }
                    
                }
            }
        } 

        return s.substring(ind, ind + max);
    }
}