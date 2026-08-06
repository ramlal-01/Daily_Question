// Last updated: 6/8/2026, 12:36:57 pm
1class Solution {
2    public int smallestNumber(int n, int t) {
3        int prod = 1 ;
4        int no = n ;
5        while(true){
6            n=no ;
7            prod=1 ;
8            while( n>0 ){
9                int rem = n%10 ;
10                prod*=rem ;
11                n=n/10 ;
12            }
13            if( prod%t==0) return no ;
14            no++;
15        }
16    }
17}