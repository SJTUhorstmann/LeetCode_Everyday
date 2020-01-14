class MovingAverage {
    private int k;
    private List<Integer> list;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        list = new ArrayList<Integer>();
        k = size;
    }
    
    public double next(int val) {
        list.add(val);
        int cnt = list.size();
        double d = 0.0;
        if(cnt<k){
            d = sum(0,cnt)/cnt;
        }else{
            d = sum(cnt-k,cnt)/k;
        }
        return d;
    }
    public double sum(int start,int end){
        int ksum = 0;
        for(int i=start;i<end;i++){
            ksum+=list.get(i);
        }
        return (double)ksum;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */