// Last updated: 14/8/2025, 4:28:56 pm
class Solution {
    public int fib(int n) {
        if (n <= 1) 
             return n;
        int arr[]= new int[30];
        arr[0] =0;
        int a =0;
        int b=1;
        arr[1]=1;
        int c;
        for( int i=2; i<30; i++){
            c = a+b;
            arr[i]=c;
            a=b;
            b=c;

        }
        // System.out.println(arr[n],arr[n-1]);
        return arr[n-1]+arr[n-2];
    }
}