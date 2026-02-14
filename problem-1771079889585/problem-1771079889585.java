// Last updated: 14/2/2026, 8:08:09 pm
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        int n = words.length ;
4
5        StringBuilder sb = new StringBuilder();
6        
7        for(int i =0 ;i<n ; i++ ){
8            int sum = 0 ;
9            for( char ch : words[i].toCharArray() ){
10                sum+= weights[ch-'a'];
11            }
12            int ind = 25 - (sum%26) ;
13            sb.append( (char)(ind+'a'));
14        }
15        return sb.toString();
16    }
17}