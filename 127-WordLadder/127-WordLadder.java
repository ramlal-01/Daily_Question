// Last updated: 16/3/2026, 12:11:21 pm
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
28                char[] arr = s.toCharArray() ;
29                for( char c = 'a' ; c<='z' ; c++ ){
30                    if( arr[i]==c ) continue ;
31
32                    arr[i] = c ;
33                    String nword = new String(arr) ;
34
35                    if( nword.equals( endWord )) return d+1 ;
36
37                    else if( set.contains(nword) ){
38                        q.add( new Pair(nword, d+1 ) );
39                        set.remove(nword) ;
40                    }
41                }
42            }
43            
44        }
45        return 0 ;
46    }
47}