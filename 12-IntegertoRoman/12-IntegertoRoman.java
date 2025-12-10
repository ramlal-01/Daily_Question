// Last updated: 10/12/2025, 11:02:00 pm
1class Solution {
2    public String intToRoman(int num) {
3     
4        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
5        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
6
7        StringBuilder sb = new StringBuilder();
8
9        int i = 0;
10    
11        while (num > 0) {
12            if (num >= values[i]) {
13                
14                sb.append(romanNumerals[i]);
15                num -= values[i];
16            } else {
17                i++;
18            }
19        }
20
21        return sb.toString();
22    }
23}