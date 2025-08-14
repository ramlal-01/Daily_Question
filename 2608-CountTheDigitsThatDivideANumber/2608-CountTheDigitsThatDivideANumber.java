// Last updated: 14/8/2025, 4:26:16 pm
class Solution {
    public int countDigits(int num) {
        int x=num;
        int f=0;
        while( num>0){
            int rem = num%10;
            if( x% rem==0){
                f++;
            }
            num/=10;
        }
        return f;
    }
}