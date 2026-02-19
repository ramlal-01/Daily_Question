// Last updated: 19/2/2026, 3:45:19 pm
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int count=0 , prev=0,curr=1 , i=1 ;
4        while( i<s.length()){
5            if( s.charAt(i-1)!=s.charAt(i)){
6                count+= Math.min( prev,curr);
7                prev=curr;
8                curr=1;
9            }
10            else{
11                curr++;
12            }
13            
14            i++;
15        }
16        return count+=Math.min(prev,curr);
17    }
18}