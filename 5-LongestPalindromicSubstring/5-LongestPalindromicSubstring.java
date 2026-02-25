// Last updated: 25/2/2026, 8:34:25 pm
1class Solution {
2    public int valid( String s , int i , int j , int[][] map){
3        if( i>=j){
4            return 1 ;
5        }
6
7        if( map[i][j]!=-1 ) return map[i][j] ;
8
9        if( s.charAt(i)==s.charAt(j)){
10            
11            return map[i][j] = valid( s , i+1 , j-1 , map);
12        }
13        else return map[i][j]=0 ;
14    }
15    public String longestPalindrome(String s) {
16        int n = s.length() ;
17        int max= 0 ;
18        int ind = 0 ;
19        int map[][] = new int[n][n];
20        for( int ele[]  : map) Arrays.fill( ele , -1);
21        for( int i = 0 ;i<n ; i++){
22            for( int j = i ; j< n ; j++){
23                if( valid( s , i , j , map)==1){
24                    if( j-i+1 > max){
25                        max = Math.max( max , j-i+1);
26                        ind = i;
27                    }
28                    
29                }
30            }
31        } 
32
33        return s.substring(ind, ind + max);
34    }
35}