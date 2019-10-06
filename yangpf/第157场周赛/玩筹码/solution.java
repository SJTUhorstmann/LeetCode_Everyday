class Solution {
    public int minCostToMoveChips(int[] chips) {
        if(chips.length==0) return 0;
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<chips.length;i++){
            set.add(chips[i]);
        }
        int min=Integer.MAX_VALUE;
        for(Integer it:set){
            min=Math.min(min,getCount(it,chips));
        }
        return min;
    }
    public int getCount(int position,int[] chips){
        int count=0;
        for(int i=0;i<chips.length;i++){
            if((chips[i]-position)%2!=0)    count++;
        }
        return count;
    }
}