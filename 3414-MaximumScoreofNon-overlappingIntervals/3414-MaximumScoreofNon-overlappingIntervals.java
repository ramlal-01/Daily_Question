// Last updated: 13/9/2026, 10:18:33 pm
1class Solution {
2    public int totalNumbers(int[] digits) {
3        Set<Integer> numbers = new HashSet<>();
4        for (int first = 0; first < digits.length; first++) {
5            if (digits[first] == 0)
6                continue;
7            for (int second = 0; second < digits.length; second++) {
8                if (second == first)
9                    continue;
10                for (int third = 0; third < digits.length; third++) {
11                    if (third == first || third == second)
12                        continue;
13                    if (digits[third] % 2 != 0)
14                        continue;
15                    int number = digits[first] * 100 + digits[second] * 10 + digits[third];
16                    numbers.add(number);
17                }
18            }
19        }
20        return numbers.size();
21    }
22}