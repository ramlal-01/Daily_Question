// Last updated: 14/8/2025, 4:26:20 pm
class Solution {
    public int pivotInteger(int n) {
        int s=0;
        int num[]= new int[n+1];
        for(int i=0;i<=n;i++){
            s+=i;
            num[i]=s;
        }
        for(int i=0;i<n;i++){
            if(num[i]== num[n]-num[i+1]){
                return i+1;
            }
        }
        return -1;

    }
}