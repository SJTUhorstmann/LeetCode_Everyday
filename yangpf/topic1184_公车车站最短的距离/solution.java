class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum=0;
        int dis=0;
        for(int i:distance){
            sum+=i;
        }
        for(int i=Math.min(start,destination);i<Math.max(start,destination);i++){
            dis+=distance[i];
        }
        return Math.min(dis,sum-dis);
    }
}