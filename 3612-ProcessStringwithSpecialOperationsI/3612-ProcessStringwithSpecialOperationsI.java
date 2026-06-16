// Last updated: 16/6/2026, 9:56:32 am
1class Solution {
2    public String processStr(String s) {
3        
4
5        StringBuilder sb = new StringBuilder() ;
6    
7        for( int i = 0 ; i<s.length()  ; i++ ){
8            char c = s.charAt(i)  ;
9            
10            if( c=='*' && sb.length()>0 ) sb.deleteCharAt( sb.length()-1 ) ;
11            else if( c=='#' ) sb.append(sb.toString()) ;
12            else if( c=='%') sb.reverse() ;
13            else if( c>='a' && c<='z' ) sb.append(c) ;
14        }
15        return sb.toString() ;
16    }
17}