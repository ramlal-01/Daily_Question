// Last updated: 7/7/2026, 8:44:50 am
1class Solution {
2    public long sumAndMultiply(int n) {
3
4        int a = n ;
5        long sum = 0 ;
6        StringBuilder sb = new StringBuilder();
7        while( a>0){
8            int rem = a%10 ;
9
10            if( rem!=0 ){
11                sum+= rem ;
12                sb.append(rem);
13            }
14            a = a/10;
15        }
16        
17        sb.reverse();
18        
19        int x = sb.length()==0? 0 : Integer.parseInt(sb.toString());
20
21        return sum* (long)(x);
22    }
23}