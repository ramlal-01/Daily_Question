// Last updated: 14/12/2025, 8:17:40 am
1class Solution {
2    public String reverseWords(String s) {
3        String arr[] = s.split(" ");
4
5        int c1 = 0 ;
6
7        for( char c : arr[0].toCharArray() ){
8            if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
9                c1++;
10            }
11        }
12
13        for( int i=1 ; i<arr.length ; i++){
14            int c2= 0 ;
15            for( char c : arr[i].toCharArray() ){
16                if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
17                    c2++;
18                }
19            }
20            if( c1==c2){
21                String st = new StringBuilder(arr[i]).reverse().toString();
22                arr[i] = st ;
23            }
24        }
25        String result = String.join( " " , arr );
26        return result ;
27    }
28}