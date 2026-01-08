// Last updated: 8/1/2026, 1:32:22 pm
1class Solution{
2
3    public int countHousePlacements(int n) {
4        int a = 1, b = 1, c = 2, mod = (int)1e9 + 7;
5        for (int i=0;i<n;++i) {
6            c=(a+b)% mod;
7            a =b;
8            b= c;
9        }
10        return (int)(1L *b * b % mod);
11    }
12}