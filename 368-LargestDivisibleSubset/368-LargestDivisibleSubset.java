// Last updated: 10/9/2026, 5:12:11 pm
1class Solution {
2    public List<Integer> largestDivisibleSubset(int[] nums) {
3        int n = nums.length ;
4        List<Integer> list = new ArrayList<>() ;
5        Arrays.sort(nums) ;
6
7        int par[] = new int[n] ;
8        int dp[] = new int[n] ;
9
10        Arrays.fill( dp , 1 ) ;
11
12        // for( int i = 0 ; i<n ; i++ ){
13        //     par[i] = i ;
14        // }
15        Arrays.fill( par , -1 ) ;
16
17        for( int i = 1 ; i<n ; i++ ){
18            for( int j=0 ; j<i ; j++ ){
19                if( nums[i] % nums[j] ==0 ){
20                    if( dp[j]+1 > dp[i] ){
21                        par[i] = j ;
22                        dp[i] = dp[j]+1 ;
23                    }
24                }
25            }
26        }
27        // System.out.println( Arrays.toString(dp));
28        int ind = 0 ;
29        for( int i = 1 ; i<n ; i++ ){
30            if( dp[i]>dp[ind] ){
31                ind = i ;
32            }
33        }
34
35        while( ind !=-1 ){
36            list.add(nums[ind]);
37            ind = par[ind] ;
38        }
39        Collections.reverse(list) ;
40        return list ;
41    }
42}