// Last updated: 3/5/2026, 8:23:14 am
1class Solution {
2    public int sumOfPrimesInRange(int n) {
3        int rev = rev(n) ;
4
5        int l = Math.min(n,rev) ;
6        int r = Math.max(n,rev) ;
7
8        int sum = 0 ;
9
10        int i = l ;
11        while( i<=r ){
12            if( prime(i) ) sum+=i ;
13            i++;
14        }
15        return sum ;
16    }
17
18    public boolean prime( int n ) {
19        if( n<=1 ) return false ;
20        if( n==2 ) return true ;
21        if( n%2==0 ) return false ;
22
23        for( int i=3 ; i*i<=n ; i+=2 ){
24            if( n%i==0){
25                return false ;
26            }
27        }
28        return true ;
29    }
30
31    public int rev( int n ){
32        int r  = 0 ;
33        while( n>0 ){
34            int rem = n%10 ;
35            r = r*10 + rem;
36            n=n/10 ;
37        }
38        return r ;
39    }
40}