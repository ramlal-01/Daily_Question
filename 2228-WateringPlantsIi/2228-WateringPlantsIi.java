// Last updated: 14/8/2025, 4:27:04 pm
class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int a=0,b=0;
        int n=plants.length;
        int A = capacityA;
        int B = capacityB;
        for( int i=0; i< n/2 ; i++){
            if( plants[i] <= capacityA ){
                capacityA = capacityA - plants[i];
            }
            else {
                a++;
                capacityA = A;
                capacityA = capacityA - plants[i];
            }

            if( plants[n-i-1] <= capacityB){
                capacityB = capacityB - plants[n-i-1];
            }
            else {
                b++;
                capacityB = B;
                capacityB = capacityB - plants[n-i-1];
            }
        }

        if( n%2!=0){
            if (n % 2 != 0) {
            int mid = n / 2;
            if (Math.max(capacityA, capacityB) < plants[mid]) {
                a++;  
            }
        }

            
        }
        return a+b;
    }
}