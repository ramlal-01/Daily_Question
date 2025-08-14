// Last updated: 14/8/2025, 4:28:47 pm
class Solution {
    public boolean isBoomerang(int[][] points) {
        int x = points[0][0]*(points[1][1]-points[2][1]) + points[1][0]*(points[2][1]-points[0][1]) + points[2][0]*(points[0][1]-points[1][1]);

        return x!=0;
    }
}