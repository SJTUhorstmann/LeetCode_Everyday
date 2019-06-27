class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==0)    return 0;
        if(n==1)    return cost[0];
        for(int i=n-3;i>=0;i--){
            cost[i]+=Math.min(cost[i+1],cost[i+2]);
        }
        return Math.min(cost[0],cost[1]);
    }
}