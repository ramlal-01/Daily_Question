// Last updated: 11/1/2026, 8:43:58 am
1class Solution {
2    public long countPairs(String[] words) {
3        HashMap<List<Integer>,Integer> map = new HashMap<>();
4
5        for( String curr:words){
6            int first = curr.charAt(0)-'a';
7            List<Integer> list = new ArrayList<>();
8
9            for( int i =0 ;i<curr.length(); i++){
10                list.add( (curr.charAt(i) -first- 'a'+26)%26) ;
11            }
12
13            // System.out.println(list);
14
15            map.put(list,map.getOrDefault(list,0)+1);
16        }
17
18        long c =0 ;
19        for(int val: map.values()){
20            c+= (long)val*(val-1)/2;
21        }
22        return c ;
23    }
24}