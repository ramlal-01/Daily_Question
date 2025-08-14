// Last updated: 14/8/2025, 4:28:17 pm
class Solution {
    public int numberOfSteps(int num) {
        int f=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
            }
            else num=num-1;
            f++;
        }
        return f;
    }
}