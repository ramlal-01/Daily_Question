// Last updated: 31/1/2026, 10:20:56 pm
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int n = letters.length;
4        int low = 0, high = n - 1;
5
6        while (low <= high) {
7            int mid = low + (high - low) / 2;
8
9            if (letters[mid] <= target) {
10                low = mid + 1;
11            } else {
12                high = mid - 1;
13            }
14        }
15        return letters[low % n];
16    }
17}
18