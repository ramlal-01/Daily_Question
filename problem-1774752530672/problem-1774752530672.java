// Last updated: 29/3/2026, 8:18:50 am
1class EventManager {
2    Map<Integer,Integer> map ;
3    PriorityQueue<int[]> pq ; 
4    public EventManager(int[][] events) {
5        map = new HashMap<>() ;
6        pq = new PriorityQueue<>( (a,b )-> {
7            if( b[0]!=a[0] ) return b[0]-a[0] ;
8
9            return a[1] - b[1] ;
10        });
11        int n = events.length ;
12        for( int i=0 ; i<n ; i++ ){
13            map.put( events[i][0] , events[i][1] );
14            pq.add( new int[]{events[i][1] , events[i][0] });
15        }
16    }
17    
18    public void updatePriority(int Id, int newP) {
19        map.put( Id , newP);
20        pq.add( new int[]{newP , Id });
21    }
22    
23    public int pollHighest() {
24        while( !pq.isEmpty() ){
25            int[] curr = pq.peek() ;
26            int a = curr[0] ;
27            int b = curr[1] ;
28
29            if( !map.containsKey(b) ){
30                pq.poll() ;
31                continue ;
32            }
33            if( map.get(b) == a ){
34                pq.poll();
35                map.remove(b) ;
36                return b ;
37            }
38            else pq.poll();
39        }
40        return -1 ;
41    }
42}
43
44/**
45 * Your EventManager object will be instantiated and called as such:
46 * EventManager obj = new EventManager(events);
47 * obj.updatePriority(eventId,newPriority);
48 * int param_2 = obj.pollHighest();
49 */