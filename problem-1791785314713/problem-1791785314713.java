// Last updated: 12/10/2026, 11:38:34 am
1class Solution {
2    public String reverseWords(String s) {
3        s=s.trim();
4        String arr[]= s.split("\s+");
5        String ans="";
6        for( int i=arr.length-1; i>=1; i--){
7            ans+=arr[i]+" ";
8        }
9        ans+=arr[0];
10        return ans;
11    }
12}