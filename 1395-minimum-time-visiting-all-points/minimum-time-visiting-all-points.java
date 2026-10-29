
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {

        int time = 0;

        for (int i = 1; i < points.length; i++) {

            // Difference between X coordinates
            int x = Math.abs(points[i][0] - points[i-1][0]);

            // Difference between Y coordinates
            int y = Math.abs(points[i][1] - points[i-1][1]);

            // Minimum time to reach next point
            time += Math.max(x, y);
        }

        return time;
    }
}
