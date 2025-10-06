// Last updated: 7/10/2025, 4:40:00 am
class Solution {
    public boolean isMatch(String s, String p) {
        int i = s.length();
        int j = p.length();

        Boolean dp[][] = new Boolean[i][j];

        // for( int ele[] : dp) Arrays.fill( ele , -1 );

        return match( s,p , i-1 , j-1 , dp);

    }

    public boolean match( String s , String p , int i , int j , Boolean dp[][]){
        if( i<0 && j<0) return true ;

        if( j<0 && i>=0 ) return false ;

        if( i<0 && j>=0) {
            for( int k=0 ; k<=j  ; k++){
                if( p.charAt(k)!='*') return false;
            }
            return true;
        }

        if( dp[i][j]!=null) return dp[i][j];

        if( s.charAt(i)== p.charAt(j) || p.charAt(j)=='?'){
            return dp[i][j] = match( s, p , i-1 , j-1 ,dp);
        }

        if( p.charAt(j)=='*'){
            return dp[i][j] = match( s, p , i-1,j ,dp) || match( s, p , i , j-1 , dp );
        }
        return dp[i][j] = false;
    }
}