// Last updated: 19/3/2026, 8:49:00 pm
1class Solution {
2    public int[][] merge(int[][] arr ) {
3
4        Arrays.sort( arr , (a,b)-> Integer.compare(a[0],b[0]) );
5        int n = arr.length ;
6        List<int[]> list = new ArrayList<>() ;
7
8        int ps = arr[0][0] ;
9        int pe = arr[0][1] ;
10
11        for( int i = 1 ; i<n ; i++ ){
12            int cs = arr[i][0] ;
13            int ce = arr[i][1] ;
14
15            if( cs <= pe ){
16                pe = Math.max(pe , ce );
17            }
18            else{
19                list.add( new int[]{ps , pe });
20                ps = cs ;
21                pe = ce ;
22            }
23        }
24        list.add( new int[]{ps , pe });
25        return list.toArray(new int[list.size()][]);
26    }
27}