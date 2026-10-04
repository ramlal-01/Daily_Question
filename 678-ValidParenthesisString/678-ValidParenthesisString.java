// Last updated: 4/10/2026, 10:57:38 am
1class Solution {
2    public boolean checkValidString(String s) { 
3        int min = 0 , max = 0 ;
4
5        for( int i =0 ; i<s.length() ; i++){
6            if( s.charAt(i)=='('){
7                min++;
8                max++;
9            }
10            else if(s.charAt(i)==')' ){
11                min--;
12                max--;
13            }
14            else{
15                min--;
16                max++;
17            }
18            if( min<0) min = 0 ;
19            if( max<0) return false ;
20        }
21        return min==0;
22    }
23}