// Last updated: 14/8/2025, 4:26:14 pm
class Solution {
    public int[] closestPrimes(int left, int right) {
        int prime[] = new int[right+1];
        for(int i=2; i<=right; i++){
            prime[i]=1;
        }

        for( int i=2 ; i<=Math.sqrt(right) ; i++){
            if( prime[i]==1){
                for( int j=i*i ; j<= right ; j=j+i){
                    prime[j]=0;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for( int i=left; i<=right ; i++){
            if( prime[i]==1){
                res.add(i);
            }
        }
        int arr[] = new int[2];
        arr[0]=arr[1]=-1;
        if( res.size()>=2){
            int dif =  res.get(1) - res.get(0);
            int min = Integer.MAX_VALUE;
            
            arr[0]= res.get(0);
            arr[1]= res.get(1);
            for( int i=1; i<res.size()-1 ; i++){
                min= Math.min( min, dif);
                dif= res.get(i+1)- res.get(i);
                int k=0;
                if( dif<min){
                    arr[k++]=res.get(i);
                    arr[k] = res.get(i+1);
                }
            }
        }
        return arr;
    }
    
}