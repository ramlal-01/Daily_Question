// Last updated: 14/8/2025, 4:26:56 pm
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int a=0;
        int b=0;
        int c=0;
        for( int ele: nums){
            if( ele<pivot){
                arr1.add(ele);
                a++;
            }
            else if( ele>pivot) {
                arr2.add(ele);
                b++;
            }
            else{
                c++;
            }
        }
        int x=0;
        for( int i=0; i<a; i++){
            nums[i]= arr1.get(x++);
        }
        for( int i=a; i<a+c; i++){
            nums[i]=pivot;
        }
        x=0;
        for( int i=a+c; i<nums.length; i++){
            nums[i]= arr2.get(x++);
        }
        return nums;

    }
}