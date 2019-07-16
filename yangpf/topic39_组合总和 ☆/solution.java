class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumHelp(res,list,candidates,target,0);
        return res;
    }
    public boolean combinationSumHelp(List<List<Integer>> res,List<Integer> list,
                                      int[] candidates,int target,int start){
        if(target<0){
            return false;
        }else if(target==0){
            List<Integer> temp=new ArrayList<>(list);
            res.add(temp);
            return false;
        }else{
            for(int i=start;i<candidates.length;i++){
                list.add(candidates[i]);
                boolean flag=combinationSumHelp(res,list,candidates,target-candidates[i],i);
                list.remove(list.size()-1);
                if(flag!=true){
                    break;
                }
            }
        }
        return true;
    }
}