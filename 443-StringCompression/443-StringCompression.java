// Last updated: 10/3/2026, 4:51:35 pm
1class Solution {
2    public int compress(char[] chars) {
3        int n = chars.length ;
4        char curr = chars[0] ;
5        int cnt = 1 ;
6
7        StringBuilder sb = new StringBuilder() ;
8        for( int i=1 ; i<n ; i++ ){
9            if( chars[i] == curr ){
10                cnt++;
11            }
12            else{
13                if( cnt==1 ){
14                    sb.append(curr) ;
15                }
16                else{
17                    sb.append(curr);
18                    sb.append(cnt);
19                }
20                cnt = 1 ;
21                curr = chars[i] ;
22            }
23        }
24        if(cnt==1) sb.append(curr);
25        else {sb.append(curr);
26        sb.append(cnt) ;}
27
28        int i =0 ;
29        for( i =0 ; i<sb.length() ; i++ ){
30            chars[i] = sb.charAt(i);
31        }
32
33        if(i<n){
34            for(int j=i ;j<n ;j++){
35                chars[j] = 0 ;
36            }
37        }
38        return sb.length();
39    }
40}