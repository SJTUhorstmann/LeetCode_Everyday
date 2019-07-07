class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for (int[] booking : bookings) {
            for (int i = booking[0] - 1; i <= booking[1] - 1; i++) {
                res[i] += booking[2];
            }
        }
        return res;
    }
}