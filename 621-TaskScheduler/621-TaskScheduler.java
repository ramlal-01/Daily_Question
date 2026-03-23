// Last updated: 23/3/2026, 3:22:47 pm
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3
4        int[] freq = new int[26];
5        for (char c : tasks) {
6            freq[c - 'A']++;
7        }
8
9        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
10
11        for( int ele : freq ){
12            if( ele>0 ){
13                pq.add(ele);
14            }
15        }
16        int time = 0 ;
17        while( !pq.isEmpty() ){
18            List<Integer> temp = new ArrayList<>() ;
19            for( int i=1 ; i<=n+1 ; i++ ){
20                if( !pq.isEmpty() ){
21                    int curr = pq.poll() ;
22                    curr--;
23                    temp.add(curr) ;
24                }
25            }
26
27            for( int ele : temp ) if( ele>0 ) pq.add(ele) ;
28
29            if( pq.isEmpty() ) time+= temp.size() ;
30            else time+= n+1 ;
31
32        }
33        return time ;
34    }
35}