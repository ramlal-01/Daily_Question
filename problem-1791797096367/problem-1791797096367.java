// Last updated: 12/10/2026, 2:54:56 pm
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int prefix[]= new int[gain.length+1];
4        prefix[0]=0;
5
6        for(int i=1; i<prefix.length;i++){
7            prefix[i]= prefix[i-1]+ gain[i-1];
8        }
9
10        int max=prefix[0];
11        for( int i=1; i<prefix.length; i++){
12            max= Math.max(max, prefix[i]);
13        }
14        return max;
15    }
16}