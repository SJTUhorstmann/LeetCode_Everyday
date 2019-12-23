//33%
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

// 100%
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum=0;
        int dis=0;
        for(int i:distance){
            sum+=i;
        }
        int l=Math.min(start,destination);
        int r=Math.max(start,destination);
        for(int i=l;i<r;i++){
            dis+=distance[i];
        }
        return Math.min(dis,sum-dis);
    }
}