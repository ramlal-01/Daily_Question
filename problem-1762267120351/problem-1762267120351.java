// Last updated: 4/11/2025, 8:08:40 pm
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });

        List<Integer> lis = new ArrayList<>();
        for (int[] env : envelopes) {
            int h = env[1];
            int idx = Collections.binarySearch(lis, h);
            if (idx < 0) idx = -(idx + 1);
            if (idx == lis.size()) lis.add(h);
            else lis.set(idx, h);
        }

        return lis.size();
    }
}