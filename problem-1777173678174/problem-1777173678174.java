// Last updated: 26/4/2026, 8:51:18 am
1class Solution {
2    public boolean isVowel(char c ){
3        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ;
4    }
5    public String sortVowels(String s) {
6        int n = s.length() ;
7        
8        Map<Character,Integer> map = new HashMap<>() ;
9        Map<Character,Integer> idx = new HashMap<>();
10        List<Character> list = new ArrayList<>();
11        
12        for( int i = 0 ; i<n; i++ ){
13            char c = s.charAt(i) ;
14            if(isVowel(c)){
15                list.add(c);
16                map.put(c, map.getOrDefault(c,0)+1);
17                idx.putIfAbsent(c,i);
18            }
19        }
20        Collections.sort(list , (a,b)-> {
21            if( !map.get(a).equals(map.get(b))) return map.get(b)-map.get(a);
22            return idx.get(a)-idx.get(b) ;
23        });
24
25        StringBuilder res = new StringBuilder(s);
26        int k  = 0 ;
27
28        for( int i =  0; i<n ; i++ ){
29            if ( isVowel(s.charAt(i))){
30                res.setCharAt(i,list.get(k++));
31            }
32        }
33        return res.toString();
34    }
35}