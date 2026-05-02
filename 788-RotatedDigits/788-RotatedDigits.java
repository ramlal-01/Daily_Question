// Last updated: 2/5/2026, 8:35:42 pm
1class Solution {
2    public int rotatedDigits(int n) {
3        int count = 0;
4        for(int num = 0; num <= n; num++) {
5            boolean isValid = isValidGoodNumber(num);
6            if(isValid) {
7                count++;
8            } 
9        }   
10        return count ;
11    }
12    private boolean isValidGoodNumber(int num) {
13        boolean isValid = false;
14        while(num > 0) {
15            int digit = num % 10;
16            if( digit == 3 || digit == 4 || digit == 7) {
17                return false;
18            }
19            if(digit == 2 || digit == 5 || digit == 6 || digit == 9) {
20                isValid = true;
21            }
22            num /= 10;
23        }
24        return isValid;
25    }
26}