// Last updated: 14/8/2025, 4:27:51 pm
class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int arr[] = new int[n];
        arr[0]= customers[0][0] + customers[0][1];
        
        for( int i=1; i<n; i++){
            if( customers[i][0] < arr[i-1]){
                arr[i]= customers[i][1] + arr[i-1];
            }
            else{
                arr[i]= customers[i][0]+ customers[i][1];
            }
        }
        double sum= 0;
        for( int i=0; i<n; i++){
            arr[i]= arr[i]- customers[i][0];
            sum+=arr[i];
            // System.out.println(arr[i]);
        }
        return (double)sum/n;
    }
}