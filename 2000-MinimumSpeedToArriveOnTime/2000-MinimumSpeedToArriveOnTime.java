// Last updated: 14/8/2025, 4:27:24 pm
class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1;
        int high = (int)1e7;  
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(dist, hour, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean possible(int[] dist, double hour, int speed) {
        double time = 0.0;
        for (int i = 0; i < dist.length; i++) {
            if (i == dist.length - 1) {
                time += (double) dist[i] / speed;  
            } else {
                time += Math.ceil((double) dist[i] / speed);  
            }
        }
        return time <= hour;
    }
}
