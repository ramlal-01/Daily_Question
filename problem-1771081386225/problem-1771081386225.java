// Last updated: 14/2/2026, 8:33:06 pm
1class Solution {
2    public int prefixConnected(String[] words, int k) {
3        int n = words.length ;
4
5        Map<String,Integer> map = new HashMap<>();
6        int c = 0 ;
7        for( int i =0 ; i<n ; i++ ){
8            if( words[i].length()<k) continue ;
9            
10            String curr = words[i].substring(0,k);
11            map.put( curr , map.getOrDefault(curr,0)+1);
12        }
13        for( int ele : map.values()){
14            if( ele>=2){
15                c++;
16            }
17        }
18        return c ;
19    }
20}