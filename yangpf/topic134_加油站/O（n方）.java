class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        if(n==0)    return -1;
        for(int i=0;i<n;i++){
            if(cost[i]>gas[i])  continue;
            int sum=0;
            int count=0;
            for(int j=i;j<i+n;j++){
                sum+=gas[j%n]-cost[j%n];
                if(sum<0)   break;
                count++;
                //if(sum<0)   break;
            }
            if(count==n)    return i;
        }
        return -1;
    }
}