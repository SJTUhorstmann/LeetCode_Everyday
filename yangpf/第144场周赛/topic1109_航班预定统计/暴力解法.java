class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] answer=new int[n];
        int num=bookings.length;
        for(int i=0;i<num;i++){
            for(int j=bookings[i][0];j<=bookings[i][1];j++){
                answer[j-1]+=bookings[i][2];
            }
        }
        return answer;
    }
}
