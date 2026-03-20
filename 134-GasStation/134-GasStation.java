// Last updated: 20/3/2026, 5:10:02 pm
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int totgas = 0 ;
4        int totcost = 0 ;
5
6        int n = gas.length ;
7
8        for( int i =0; i<n ;i++ ){
9            totgas+= gas[i];
10            totcost+=cost[i];
11        }
12
13        if( totgas<totcost ) return -1 ;
14
15        int start = 0 ;
16        int currgas = 0 ;
17
18        for( int i =0 ; i<n ; i++ ){
19            currgas = currgas + gas[i] - cost[i] ;
20
21            if( currgas<0 ) {
22                currgas = 0 ;
23                start = i+1 ;
24            }
25        }
26
27        return start ;
28    }
29}