// Last updated: 12/10/2026, 2:01:09 pm
1class Solution {
2    public int maxVowels(String s, int k) {
3        int n = s.length() ;
4
5        int cnt = 0 ;
6
7        int maxi = 0 ;
8        for( int i = 0 ; i<k ; i++ ){
9            if( vowel(s.charAt(i) ) ){
10                cnt++;
11                maxi = Math.max( maxi , cnt ) ;
12            } 
13        }
14
15        for( int i = k ; i<n ; i++ ){
16            if( vowel(s.charAt(i) ) ){
17                cnt++;
18            } 
19            if( vowel(s.charAt(i-k) ) ){
20                cnt--;
21            } 
22            maxi = Math.max( maxi , cnt ) ;
23        }
24        return maxi ;
25    }
26
27    public boolean  vowel( char c ){
28        if( c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
29            return true;
30        }
31        return false ;
32    }
33}