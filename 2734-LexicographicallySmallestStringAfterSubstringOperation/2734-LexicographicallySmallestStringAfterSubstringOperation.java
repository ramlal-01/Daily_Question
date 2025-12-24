// Last updated: 24/12/2025, 4:11:56 pm
1class Solution {
2    public String smallestString(String s) {
3        int n = s.length();
4        char[] arr = s.toCharArray();
5        int i =0 ;
6        while(i<n && arr[i]=='a'){
7            i++;
8        }
9
10        if( i==n){
11            arr[n-1]='z';
12            return new String(arr);
13        }
14
15        while( i<n && arr[i]!='a'){
16            
17            arr[i] = (char)(arr[i]-1);
18            i++;
19        }
20        return new String(arr);
21
22    }
23}