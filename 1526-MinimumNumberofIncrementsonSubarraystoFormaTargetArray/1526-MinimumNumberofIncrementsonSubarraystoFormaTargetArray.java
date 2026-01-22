// Last updated: 22/1/2026, 3:10:55 pm
1class Solution {
2    public int minNumberOperations(int[] target) {
3        int n = target.length ;
4
5        int sum  =0 ;
6        
7        for( int i =0 ; i<n-1 ; i++){
8
9            if( target[i+1]<target[i] ){
10                sum+= target[i]-target[i+1] ;
11            }
12
13           
14        }
15         sum+= target[n-1];
16         return sum ;
17    }
18}