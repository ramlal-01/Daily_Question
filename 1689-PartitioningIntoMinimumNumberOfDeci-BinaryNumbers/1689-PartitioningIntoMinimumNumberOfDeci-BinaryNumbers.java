// Last updated: 1/3/2026, 9:49:38 pm
1class Solution {
2    public int minPartitions(String n) {
3        int max=0;
4        for( int i=0; i<n.length() ; i++){
5            max= Math.max(n.charAt(i)-'0', max);
6        }
7        return max;
8    }
9}