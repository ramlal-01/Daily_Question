// Last updated: 22/2/2026, 8:27:27 am
1class Solution {
2    public boolean isDigitorialPermutation(int n) {
3        
4        int ans = 0 ;
5        int no = n;
6        int arr[] = new int[10] ;
7        while( n>0 ){
8            int rem = n%10 ;
9            arr[rem]++;
10            ans+= fact(rem);
11            n=n/10 ;
12        }
13
14        int res[] = new int[10];
15        while( ans>0){
16            int rem = ans%10;
17            res[rem]++;
18            ans/=10;
19        }
20        return Arrays.equals(arr,res);
21    }
22    public int fact( int rem ){
23        if( rem==0 ){
24            return 1 ;
25        }
26
27        return rem* fact(rem-1); 
28    }
29}