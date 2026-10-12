// Last updated: 12/10/2026, 11:11:59 am
1class Solution {
2    public String gcdOfStrings(String str1, String str2) {
3        if (!(str1 + str2).equals(str2 + str1)) {
4            return "";
5        }
6
7        int gcd = gcd(str1.length(), str2.length());
8
9        return str1.substring(0, gcd);
10    }
11
12    private int gcd(int a, int b) {
13        while (b != 0) {
14            int temp = b;
15            b = a % b;
16            a = temp;
17        }
18
19        return a;
20    }
21}