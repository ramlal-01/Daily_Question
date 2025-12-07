// Last updated: 7/12/2025, 8:33:17 am
1class Solution {
2    public int largestPrime(int n) {
3        int sum =0 ;
4        int ans = 0 ;
5        for( int i =2 ; i<=n ;i++){
6            boolean flag = true;
7            for( int j = 2 ; j*j<= i ; j++){
8                if( i%j ==0 ){
9                    flag = false ;
10                    break ;
11                }
12            }
13            if( !flag) continue ;
14            sum+= i ;
15            if( sum>n ) break ;
16            boolean sumP = true ;
17            if( sum < 2) sumP = false ;
18            else{
19            for( int k =2 ; k*k <= sum ; k++){
20                if( sum%k ==0){
21                    sumP = false ;
22                    break;
23                }
24            }
25            }
26            if( sumP){
27                ans = sum;
28            }
29        }
30        return ans ;
31    }
32}