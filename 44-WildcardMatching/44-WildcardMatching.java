// Last updated: 25/4/2026, 10:54:53 pm
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int i = s.length();
4        int j = p.length();
5
6        Boolean dp[][] = new Boolean[i][j];
7
8        // for( int ele[] : dp) Arrays.fill( ele , -1 );
9
10        return match( s,p , i-1 , j-1 , dp);
11
12    }
13
14    public boolean match( String s , String p , int i , int j , Boolean dp[][]){
15        if( i<0 && j<0) return true ;
16
17        if( j<0 && i>=0 ) return false ;
18
19        if( i<0 && j>=0) {
20            for( int k=0 ; k<=j  ; k++){
21                if( p.charAt(k)!='*') return false;
22            }
23            return true;
24        }
25
26        if( dp[i][j]!=null) return dp[i][j];
27
28        if( s.charAt(i)== p.charAt(j) || p.charAt(j)=='?'){
29            return dp[i][j] = match( s, p , i-1 , j-1 ,dp);
30        }
31
32        if( p.charAt(j)=='*'){
33            return dp[i][j] = match( s, p , i-1,j ,dp) || match( s, p , i , j-1 , dp );
34        }
35        return dp[i][j] = false;
36    }
37}