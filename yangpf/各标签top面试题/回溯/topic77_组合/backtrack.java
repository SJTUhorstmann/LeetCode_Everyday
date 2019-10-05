class Solution {
    private List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(k>n) return res;
        boolean[] visit=new boolean[n+1];
        List<Integer> list=new ArrayList<>();
        help(n,k,1,visit,list);
        return res;
    }
    public void help(int n,int k,int index,boolean[] visit,List<Integer> list){
        if(list.size()==k){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<=n;i++){
            if(!visit[i]){
                visit[i]=true;
                list.add(i);
                help(n,k,i+1,visit,list);
                visit[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
}