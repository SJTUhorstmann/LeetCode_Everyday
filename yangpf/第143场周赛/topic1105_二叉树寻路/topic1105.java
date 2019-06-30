class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> list=new ArrayList<>();
        int level=0;
        int value=label;
        while(value!=0){
            value=value/2;
            level++;
        }
        while(level-->=2){
            list.add(0,label);
            int sum=(int)(Math.pow(2,level)+Math.pow(2,level-1))-1;
            label=sum-label/2;
        }
        list.add(0,1);
        return list;
    }
}