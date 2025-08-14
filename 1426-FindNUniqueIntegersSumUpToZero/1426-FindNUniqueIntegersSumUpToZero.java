// Last updated: 14/8/2025, 4:28:20 pm
class Solution {
    public int[] sumZero(int n) {
        int arr[]= new int[n];
        if(n%2==0){
            int x=0;
            for( int i=1; i<=n/2; i++){
                arr[x++]=i;
                arr[x++]= -1*i;
               
            }
        }

        else{
            arr[0]=0;
            int x=1;
            for(int i=1; i<=n/2 ; i++){
                arr[x++]=i;
                arr[x++]=-1*i;
                
            }

        }
        return arr;
    }
}