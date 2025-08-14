// Last updated: 14/8/2025, 4:28:53 pm
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length - 1;
        int carry = 0;

        while (n >= 0 || k > 0) {
            int digit = (n >= 0 ? num[n] : 0) + (k % 10) + carry;
            result.add(digit % 10); 
            carry = digit / 10;    
            k /= 10;               
            n--;                   
        }

        if (carry > 0) {
            result.add(carry);
        }

        Collections.reverse(result); 
        return result;
    }
}