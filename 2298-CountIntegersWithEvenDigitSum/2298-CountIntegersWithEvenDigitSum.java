// Last updated: 14/8/2025, 4:26:49 pm
class Solution {
    public int countEven(int num) {
        int f=0;
        for( int i =2; i<=num ; i++){
            int sum=0;
            int a=i;
            while(a>0){
                int rem = a%10;
                sum+=rem;
                a/=10;
            }
            if(sum%2==0){
                f++;
            }
        }
        return f;
    }
}