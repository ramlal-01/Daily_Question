// Last updated: 17/1/2026, 8:52:07 pm
1class Solution {
2    public int[] bestTower(int[][] towers, int[] center, int radius) {
3        Arrays.sort( towers, (a,b)-> a[2]-b[2]);
4
5        int n = towers.length ;
6        
7        boolean vis[] = new boolean[n];
8
9        for( int i = 0 ; i<n ; i++){
10
11            int x = towers[i][0];
12            int y = towers[i][1] ;
13
14            int a = center[0];
15            int b = center[1] ;
16
17            int dist = Math.abs(x-a)+Math.abs(y-b);
18
19            if( dist<=radius){
20                vis[i] = true;
21            }
22        }
23        
24
25        int max = -1 ;
26        int cnt = 0 ;
27        int ind = -1 ;
28        for( int i = 0 ; i<n ; i++){
29            if( vis[i]){
30                max = Math.max( towers[i][2] , max );
31            }
32        }
33        
34        if( max == -1 ) return new int[]{-1,-1};
35    
36        int arr[] = new  int[2];
37        
38        ArrayList<Integer> list = new ArrayList<>();
39        for( int i = 0 ; i<n ; i++){
40            if( vis[i] && towers[i][2]==max){
41                list.add( i);
42            }
43        }
44        
45        if(list.size()==1){
46            int idx = list.get(0) ;
47            arr[0]= towers[idx][0];
48            arr[1] = towers[idx][1];
49            return arr ;
50        }
51
52        int x = Integer.MAX_VALUE ;
53        int y = Integer.MAX_VALUE ;
54
55        for( int idx : list){
56            int nx= towers[idx][0];
57            int ny = towers[idx][1];
58            
59            if( nx<x || (nx== x && ny < y) )
60            {
61                x = nx ;
62                y = ny ;
63            }
64        }
65
66        return new int[]{x,y};
67        
68    }
69}