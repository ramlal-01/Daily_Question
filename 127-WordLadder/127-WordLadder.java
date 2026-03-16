// Last updated: 16/3/2026, 11:55:51 am
1class Pair{
2    String str ;
3    int dist ;
4    Pair( String str , int dist ){
5        this.str = str ;
6        this.dist = dist ;
7    }
8}
9class Solution {
10    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
11        HashSet<String> set = new HashSet<>() ;
12        for( String ele : wordList ){
13            set.add( ele ) ;
14        }
15
16        Queue<Pair> q = new LinkedList<>() ;
17        q.add( new Pair(beginWord, 1 )) ;
18        set.remove( beginWord ) ;
19
20        if( !set.contains(endWord) ) return 0 ;
21        
22        while( !q.isEmpty() ){
23            String s = q.peek().str ;
24            int d = q.peek().dist ;
25            q.poll() ;
26
27            for( int i =0 ; i<s.length() ; i++ ){
28                for( char c = 'a' ; c<='z' ; c++ ){
29                    char[] arr = s.toCharArray() ;
30
31                    if( arr[i]==c ) continue ;
32
33                    arr[i] = c ;
34                    String nword = new String(arr) ;
35
36                    if( nword.equals( endWord )) return d+1 ;
37
38                    else if( set.contains(nword) ){
39                        q.add( new Pair(nword, d+1 ) );
40                        set.remove(nword) ;
41                    }
42                }
43            }
44            
45        }
46        return 0 ;
47    }
48}