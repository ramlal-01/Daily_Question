// Last updated: 11/3/2026, 11:17:03 pm
1class Solution {
2    public int bitwiseComplement(int n) {
3        String binary=Integer.toBinaryString(n);
4        StringBuilder sb=new StringBuilder();
5        for(char ch:binary.toCharArray()){
6            if(ch=='1') sb.append('0');
7            else sb.append('1');
8        }
9        return Integer.parseInt(sb.toString(),2);
10    }
11}