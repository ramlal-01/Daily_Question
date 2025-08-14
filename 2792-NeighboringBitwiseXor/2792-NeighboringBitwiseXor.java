// Last updated: 14/8/2025, 4:25:55 pm
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int f=0;
        for(int ele: derived){
            f=f^ele;
        }
        return f==0;
    }
}