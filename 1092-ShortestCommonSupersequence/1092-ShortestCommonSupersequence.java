// Last updated: 27/3/2026, 1:16:23 am
1class Solution {
2    public String shortestCommonSupersequence(String str1, String str2) {
3        int m = str1.length();
4        int n = str2.length();
5
6        int dp[][] = new int[m+1][n+1];
7
8        for( int i =1 ; i<=m ; i++){
9            for( int j = 1 ; j<=n ; j++){
10                if( str1.charAt(i-1)==str2.charAt(j-1)){
11                    dp[i][j] =1+ dp[i-1][j-1];
12                }
13                else{
14                    dp[i][j] = Math.max( dp[i-1][j] , dp[i][j-1]);
15                }
16            }
17        }
18
19        StringBuilder sb = new StringBuilder();
20        int i = m , j=n ; 
21
22        while( i>0 && j>0){
23            if( str1.charAt(i-1)==str2.charAt(j-1)){
24                sb.append(str1.charAt(i-1));
25                i--;
26                j--;
27            }
28            else if( dp[i-1][j] > dp[i][j-1] ){
29                sb.append(str1.charAt(i-1));
30                i--;
31            }
32            else{
33                sb.append(str2.charAt(j-1));
34                j--;
35            }
36        }
37
38        while( i>0) {
39            sb.append(str1.charAt(i-1));
40            i--;
41        }
42        while( j>0) {
43            sb.append(str2.charAt(j-1));
44            j--;
45        }
46        sb.reverse();
47        return sb.toString();
48
49    }
50}