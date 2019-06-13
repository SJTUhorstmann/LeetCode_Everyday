class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0)  return res;
        for(int i=1;i<=numRows;i++){
            ArrayList<Integer> list=new ArrayList<>();
            if(i==1)    list.add(1);
            if(i==2){
                list.add(1);
                list.add(1);
            }
            if(i>2){
                list.add(1);
                for(int j=1;j<i-1;j++){
                    list.add(res.get(i-2).get(j-1)+res.get(i-2).get(j));
                }
                list.add(1);
            }
            res.add(list);   
        }
        return res;
    }
}