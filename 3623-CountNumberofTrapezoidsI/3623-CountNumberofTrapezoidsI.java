// Last updated: 2/12/2025, 7:09:29 am
1class Solution {
2    public int countTrapezoids(int[][] points) {
3        long MOD = (long)1e9+7 ;
4
5        HashMap<Integer,Long> map = new HashMap<>();
6        for( int x[] : points ){
7            map.put( x[1] , map.getOrDefault(x[1],0L)+1 );
8        }
9
10        List<Long> list = new ArrayList<>();
11
12        for( long k : map.values() ){
13            if( k>=2 ){
14                long s = (k * (k - 1) / 2) % MOD;
15                list.add(s);
16            }
17        }
18
19        Collections.sort(list);
20
21        long prefix = 0;
22        long ans = 0;
23
24        for (long x :list) {
25            ans = (ans + (x * prefix) % MOD) % MOD;
26            prefix = (prefix + x) % MOD;
27        }
28
29        return (int) ans;
30        
31    }
32
33}