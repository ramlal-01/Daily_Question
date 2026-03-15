// Last updated: 15/3/2026, 11:41:50 am
1class Solution {
2    List<String> res ;
3    public String getHappyString(int n, int k) {
4        res = new ArrayList<>() ;
5        generate(n , new StringBuilder() ) ;
6        if( k> res.size() ) return "" ;
7        return res.get(k-1) ;
8    }
9
10    public void generate(int n, StringBuilder curr) {
11        if (curr.length() == n) {
12            res.add(curr.toString());
13            return;
14        }
15
16        char[] arr = {'a', 'b', 'c'};
17
18        for (char ch : arr) {
19            if (curr.length() == 0 || curr.charAt(curr.length() - 1) != ch) {
20
21                curr.append(ch);           
22                generate(n, curr);         
23                curr.deleteCharAt(curr.length() - 1); 
24            }
25        }
26
27    }
28}