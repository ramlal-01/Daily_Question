// Last updated: 14/8/2025, 4:28:31 pm
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int s=0;
        int f=capacity;
        for( int i=0; i<plants.length ; i++){
            if( capacity >= plants[i] ){
                s++;
                capacity= capacity- plants[i];
            }
            else{
                s+= 2*i+1;
                capacity =f;
                capacity = capacity- plants[i];
            }
            // System.out.print( "capacity: "+capacity);
            // System.out.println( "steps: "+ s);
        }
        return s;
    }
}