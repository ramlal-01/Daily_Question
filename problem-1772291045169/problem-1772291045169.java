// Last updated: 28/2/2026, 8:34:05 pm
1class Solution {
2    public String mergeCharacters(String s, int k) {
3        
4        int n = s.length() ;
5        
6        StringBuilder sb = new StringBuilder(s) ;
7
8        boolean flag = true ;
9        while( flag ){
10            flag = false ;
11            int i=0;
12            while( i<sb.length() ){
13                int j=i+1 ;
14                while( j<sb.length() ){
15                    if( (sb.charAt(i)==sb.charAt(j)) && ((j-i)<=k ) ){
16                        sb.deleteCharAt(j);
17                        flag = true;
18                        break;
19                    }
20                    if( j-i>k) break;
21                    j++;
22                }
23                if( flag) break;
24                i++;
25            }
26        }
27        return sb.toString();
28    }
29}