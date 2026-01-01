// Last updated: 1/1/2026, 7:34:58 am
1class Solution {
2    public int[] plusOne(int[] digits) {
3        ArrayList<Integer> list = new ArrayList<>();
4        int carry=1;
5        for ( int i= digits.length-1 ; i>=0 ; i--){
6            int sum = (digits[i]+carry)%10;
7            carry = (digits[i]+carry)/10 ;
8            list.add(sum);
9        }
10        if ( carry!=0){
11            list.add(carry);
12        }
13        Collections.reverse(list);
14        
15        int res[]= new int[list.size()];
16        int k=0;
17        for( int ele: list){
18            res[k]=ele;
19            k++;
20        }
21        return res;
22    }
23}