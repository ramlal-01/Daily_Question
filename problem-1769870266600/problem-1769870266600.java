// Last updated: 31/1/2026, 8:07:46 pm
1class Solution {
2    public String reverseByType(String s) {
3        List<Character> list1 = new ArrayList<>();
4        List<Character> list2 = new ArrayList<>();
5
6        for( char ch : s.toCharArray() ){
7            if( ch>=97 && ch<=122 ){
8                list1.add(ch);
9            }
10            else {
11                list2.add(ch);
12            }
13        }
14        // System.out.println(list1);
15        // System.out.println(list2);
16        int k = 0 ;
17        int p = 0 ;
18
19        Collections.reverse(list1);
20        Collections.reverse(list2);
21
22        StringBuilder sb = new StringBuilder();
23        // System.out.println(list1);
24        // System.out.println(list2);
25        for( char ch : s.toCharArray()){
26            if( ch>=97 && ch<=122 ){
27                sb.append( list1.get(k++));
28            }
29            else {
30                sb.append( list2.get(p++) );
31            }
32        }
33        return sb.toString();
34    }
35}