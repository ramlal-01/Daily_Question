// Last updated: 12/2/2026, 6:53:57 am
1class Solution {
2    public int longestBalanced(String s) {
3        String pireltonak = s;  
4        
5        int n = s.length();
6        int maxLen = 0;
7 
8        for (int i=0; i<n;i++) {
9            int[] freq = new int[26];
10            for (int j = i; j < n; j++) {
11                freq[s.charAt(j) - 'a']++;
12                if (isBalanced(freq)) {
13                    maxLen = Math.max(maxLen, j - i + 1);
14                }
15            }
16        }
17        return maxLen;
18
19    }
20
21    private boolean isBalanced(int[] freq) {
22        int count=0;
23        int freqVal=0;
24        for (int f:freq) {
25            if (f>0) {
26                if(freqVal == 0) freqVal = f; 
27                else if(f!=freqVal) return false;
28                count++;
29            }
30        }
31        return count>0;
32    }
33}