// Last updated: 14/8/2025, 4:28:58 pm
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> e = new ArrayList<>();
        ArrayList<Integer> o = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                e.add(nums[i]);
            }
            else o.add(nums[i]);
        }
        Collections.sort(e);
        Collections.sort(o, Collections.reverseOrder());

        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                arr[i] = e.get(i / 2); 
            } else {
                arr[i] = o.get(i / 2); 
            }
        }
        return arr;
    }
}