// Last updated: 1/8/2026, 9:18:16 pm
1class Solution {
2    public long minInitialStrength(int[] a, int[][] b) {
3        int n = a.length;
4        long[] diff = new long[n+1] ;
5        long bonus[] =  new long[n] ;
6
7        for( int ele[] : b ){
8            diff[ ele[0]] += ele[2] ;
9            if( ele[1] + 1 < n ){
10                diff[ele[1]+1]-=ele[2] ;
11            }
12
13            
14        }
15
16        for( int i = 0 ; i<n ; i++ ){
17            bonus[i] = (i>0? bonus[i-1] : 0 ) + diff[i] ;
18        }
19
20        long l = 0 ; 
21        long h = (long)1e18;
22
23        while( l<h ){
24            long mid = l+(h-l)/2 ;
25            boolean flag = true ;
26            long cur = mid ;
27            for( int i = 0 ; i<n ; i++ ){
28                if(cur+bonus[i]<a[i] ){
29                    flag = false ;
30                    break ;
31                }
32                cur = Math.max(0L,cur-a[i]);
33                
34            }
35            if( flag) h = mid ;
36                else l = mid+1 ;
37        }
38        return l ;
39    }
40}