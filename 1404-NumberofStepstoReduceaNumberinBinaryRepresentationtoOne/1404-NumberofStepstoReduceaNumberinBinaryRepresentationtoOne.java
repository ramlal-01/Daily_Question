// Last updated: 26/2/2026, 11:33:51 am
1class Solution {
2    public int numSteps(String s) {
3        
4        StringBuilder sb = new StringBuilder(s) ;
5        int c=0 ;
6        while (!sb.toString().equals("1")){
7            int n = sb.length() ;
8
9            if( sb.charAt(n-1) =='0' ) {
10                sb.deleteCharAt(sb.length() - 1);
11            }
12            else{
13                sb = convert(sb);
14            }
15            //System.out.println(sb);
16            c++;
17        }
18        return c ;
19    }
20
21    public StringBuilder convert( StringBuilder s ){
22        int n = s.length() ;
23
24        int i = n-1 ;
25
26        while( i>=0 && s.charAt(i)=='1'){
27            s.setCharAt(i,'0');
28            i--;
29        }
30
31        if( i>=0){
32            s.setCharAt(i,'1');
33        }
34        else{
35            s.insert(0,'1');
36        }
37        return s ;
38    }
39}