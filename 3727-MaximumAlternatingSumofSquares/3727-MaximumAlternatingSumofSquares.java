// Last updated: 19/10/2026, 1:06:52 am
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        int n = nums.length ; 
4        if( n==1 )return nums[0]*nums[0] ;
5        
6        for( int i = 0 ; i<n ; i++ ){
7            nums[i] = Math.abs(nums[i]) ;
8        }
9        Arrays.sort(nums) ;
10        if( n==2 ) return nums[1]*nums[1] -nums[0] * nums[0] ;
11        
12
13        if( n%2==0 ){
14            int len = n/2 ;
15            long sum1 = 0 ;
16            for( int i=n-1 ; i>=len ; i-- ){
17                sum1+= nums[i]*nums[i] ;
18            }
19            long sum2  = 0 ;
20            for( int i = len-1 ; i>=0 ; i--){
21                sum2+= nums[i]*nums[i] ;
22            }
23            System.out.println( sum1 +" "+sum2) ;
24            return sum1-sum2 ;
25        }
26        
27            int len = n/2 ;
28            long sum1 = 0 ;
29            for( int i=n-1 ; i>=len ; i-- ){
30                sum1+= nums[i]*nums[i] ;
31            }
32            long sum2  = 0 ;
33            for( int i = len-1 ; i>=0 ; i--){
34                sum2+= nums[i]*nums[i] ;
35            }
36            return sum1-sum2 ;
37    }
38}