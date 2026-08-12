// Last updated: 12/8/2026, 2:01:31 pm
1class Node{
2    int key ; 
3    int val ;
4    Node prev , next ;
5    Node( int key , int val ){
6        this.key = key ;
7        this.val = val ;
8    }
9}
10class LRUCache {
11    int cap ;
12    Map<Integer,Node> map ;
13    Node head , tail ;
14    public LRUCache(int capacity) {
15        cap = capacity ;
16        this.map = new HashMap<>() ;
17        head = new Node(0,0) ;
18        tail = new Node(0,0) ;
19        head.next = tail ;
20        tail.prev = head ; 
21    }
22    
23    public int get(int key) {
24        if( !map.containsKey(key) ) return -1 ;
25
26        Node node = map.get(key) ;
27        remove(node);
28        insert(node) ;
29        return node.val ;
30    }
31    
32    public void put(int key, int value) {
33        if( map.containsKey(key)){
34            Node node = map.get(key);
35            node.val = value ;
36            remove(node);
37            insert(node);
38        }
39        else{
40            if( map.size()==cap ){
41                Node last = tail.prev ;
42                remove(last);
43                map.remove(last.key);
44            }
45            
46                Node node = new Node(key,value);
47                insert(node);
48                map.put(key,node);
49            
50        }
51    }
52    public void remove(Node node ){
53        node.prev.next = node.next ;
54        node.next.prev = node.prev ;
55    }
56
57    public void insert(Node node ){
58        node.next = head.next ;
59        node.prev = head ;
60        head.next.prev = node ;
61        head.next = node ;
62    }
63}
64
65/**
66 * Your LRUCache object will be instantiated and called as such:
67 * LRUCache obj = new LRUCache(capacity);
68 * int param_1 = obj.get(key);
69 * obj.put(key,value);
70 */