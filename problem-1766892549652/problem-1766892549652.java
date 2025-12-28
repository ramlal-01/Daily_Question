// Last updated: 28/12/2025, 8:59:09 am
1class Solution {
2    public int minAllOneMultiple(int k) {
3        if( k%2 ==0 || k%5==0) return -1 ;
4        int i=1 ;
5        int div = 0 ;
6        while(i<=k ){
7            div = ((div*10)+1)%k ;
8            if(   div==0) {
9                return i ;
10            }
11            i++;
12        }
13        return -1 ;
14    }
15}