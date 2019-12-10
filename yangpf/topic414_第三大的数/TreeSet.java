class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i:nums){
            ts.add(i);
        }
        if(ts.size()<3) return ts.last();
        ts.pollLast();
        ts.pollLast();
        return ts.last();
    }
}


class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i:nums){
            ts.add(i);
            if(ts.size()>3) ts.remove(ts.first());
        }
        return ts.size()>=3?ts.first():ts.last();
    }
}