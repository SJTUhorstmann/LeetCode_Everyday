class Solution {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate("",0,0,n);
        return res;
    }
    public void generate(String s,int l,int r,int n){
        if(l>n||r>n||r>l)    return;
        if(l==n&&r==n){
            res.add(s);
            return;
        }
        generate(s+"(",l+1,r,n);
        generate(s+")",l,r+1,n);
    }
}