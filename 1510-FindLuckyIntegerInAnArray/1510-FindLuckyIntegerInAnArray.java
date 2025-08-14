// Last updated: 14/8/2025, 4:28:12 pm
class Solution {
    public int findLucky(int[] arr) {
        int max= arr[0];
        for(int ele:arr){
            if(max<ele){
                max=ele;
            }
        }
        int map[] = new int[max+1];
        for(int ele:arr){
            map[ele]++;
        }
        int ans =-1;
        for(int i=0;i<map.length;i++){
            if( map[i]==i && i!=0){
                if(ans<i){
                    ans=i;
                }
            }
        }
        return ans;
    }
}