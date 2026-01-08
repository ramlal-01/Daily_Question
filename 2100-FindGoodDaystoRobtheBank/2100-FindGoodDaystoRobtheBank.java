// Last updated: 8/1/2026, 1:46:05 pm
1class Solution {
2    public List<Integer> goodDaysToRobBank(int[] security, int time) {
3        List<Integer>list = new ArrayList<>();
4
5        if(time==0){
6            for(int i=0;i<security.length;i++){
7                list.add(i);
8            }
9
10            return list;
11        }
12
13        int pref[] = new int[security.length];
14        int suff[] = new int[security.length];
15
16        for(int i=1;i<security.length;i++){
17            if(security[i]<=security[i-1]){
18                pref[i]=pref[i-1]+1;
19            }
20        }
21
22        for(int i=security.length-2;i>=0;i--){
23            if(security[i]<=security[i+1]){
24                suff[i]=suff[i+1]+1;
25            }
26        }
27
28        for(int i=time;i<security.length-time;i++){
29            if(pref[i]>=time && suff[i]>=time){
30                list.add(i);
31            }
32        }
33        return list;
34    }
35}