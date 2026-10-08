// Last updated: 8/10/2026, 1:22:49 pm
1class Solution {
2    public String removeOuterParentheses(String s) {
3        int n = s.length() ;
4        
5        int prev = 0 ;
6        int open = 0 ;
7        int close = 0 ;
8        
9        List<String> list = new ArrayList<>() ;
10
11        for( int i = 0 ; i<n ; i++ ){
12            if( s.charAt(i)=='('){
13                open++;
14            }
15            else close++;
16
17            if( open==close ){
18                list.add( s.substring(prev,i+1) );
19                prev= i+1 ;
20            }
21        }
22
23        StringBuilder sb = new StringBuilder() ;
24
25        for( String ele : list ){
26            sb.append( ele.substring(1,ele.length()-1 ) ) ;
27        }
28        return sb.toString() ;
29    }
30}