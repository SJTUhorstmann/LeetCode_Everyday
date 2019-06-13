//  测试用例通过100/101  最后一个测试用例超时 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        List<List<String>> res=new ArrayList<>();
        boolean[] flag=new boolean[n];
        if(n==0)    return res;
        if(n==1){
            List<String> list=new ArrayList<>();
            list.add(strs[0]);
            res.add(list);
            return res;
        }
        for(int i=0;i<n-1;i++){
            List<String> list=new ArrayList<>();
            if(!flag[i]){
                list.add(strs[i]);
                for(int j=i+1;j<n;j++){
                    if(!flag[j] && isYiWeiCi(strs[i],strs[j])){
                        list.add(strs[j]);
                        flag[j]=true;
                    }
                }
                if(!list.isEmpty()) res.add(list);
            }
        }
        if(!flag[n-1])  res.add(Arrays.asList(strs[n-1]));
        return res;
    }
    public boolean isYiWeiCi(String s1,String s2){
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(String.valueOf(c1).equals(String.valueOf(c2)))   return true;
        return false;
    }
}