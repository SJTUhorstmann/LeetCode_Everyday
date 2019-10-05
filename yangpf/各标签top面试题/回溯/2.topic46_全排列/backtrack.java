class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        boolean[] visit=new boolean[n];
        List<Integer> list=new ArrayList<>();
        help(nums,visit,list);
        return res;
    }
    public void help(int[] nums,boolean[] visit,List<Integer> list){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visit[i]){
                visit[i]=true;
                list.add(nums[i]);
                help(nums,visit,list);
                visit[i]=false;
                list.remove(list.size()-1);
            }
        }
    }
}