// Last updated: 3/1/2026, 11:30:10 am
1class Pair{
2    String first ;
3    int second ;
4    Pair( String f , int s ){
5        first = f ;
6        second = s ;
7    }
8}
9class Solution {
10    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
11        Queue<Pair> q = new LinkedList<>();
12        
13        Set<String> set = new HashSet<String>(); 
14
15        for( String ele : wordList){
16            set.add( ele);
17        }
18        q.add( new Pair( beginWord,1));
19        set.remove(beginWord);
20
21        if (!set.contains(endWord)) return 0;
22        
23        while( !q.isEmpty() ){
24            Pair curr = q.poll() ;
25            String word = curr.first ;
26            int dist = curr.second ;
27
28            for(int i =0;i<word.length() ; i++){
29                char arr[] = word.toCharArray();
30                for( char ch = 'a' ; ch<='z'  ; ch++ ){
31
32                    if (arr[i] == ch) continue;
33                    arr[i] = ch ;
34                    String nword = new String(arr);
35
36                    if (nword.equals(endWord)) {
37                        return dist + 1;
38                    }
39                    else if( set.contains(nword) ){
40                        q.add( new Pair( nword , dist+1));
41                        set.remove(nword);
42                    }
43                    
44                }
45            }
46        }
47
48        return 0 ;
49
50    }
51}