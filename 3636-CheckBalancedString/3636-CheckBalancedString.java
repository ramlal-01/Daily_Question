// Last updated: 14/8/2025, 4:25:09 pm
class Solution {
    public boolean isBalanced(String num) {
        int[] arr= new int[num.length()];
        int s=0;
        int sc=0;
        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i) - '0'; 
            if( i%2==0){
                s+=arr[i];
            }
            else{
                sc+=arr[i];
            }
        }

        return s==sc;
    }
}