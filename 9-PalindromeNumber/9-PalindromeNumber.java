// Last updated: 9/5/2026, 12:06:26 am
1class Solution {
2    public boolean isPalindrome(int x) {
3        int n=x;
4        int s=0;
5        if(x<0)
6            return false;
7        else{
8            while(x!=0){
9            int rem=x%10;
10            s=(s*10)+rem;
11            x=x/10;
12            }
13        }
14        
15        // System.out.println(s);
16        if ( n==s){
17            return true;
18        }
19        else
20            return false;
21    }
22}