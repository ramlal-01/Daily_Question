// Last updated: 14/8/2025, 4:28:44 pm
class Solution {
    public void duplicateZeros(int[] arr) {
        int temp[]=arr.clone();
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            
            arr[i] = temp[j];

           
            if (temp[j] == 0 && i + 1 < arr.length) {
                arr[++i] = 0; 
            }
        }
    }
}