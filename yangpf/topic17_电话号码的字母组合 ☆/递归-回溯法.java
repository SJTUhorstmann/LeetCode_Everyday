//根据视频C++代码改写，还需要自己亲自重写一遍
class Solution {
    List<String> res=new ArrayList<>();
    String[] letters=new String[]{" ","!@#","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)    return res;
        combination(digits,0,"");
        return res;
    }
    public void combination(String digits,int index,String str){
        if(index==digits.length()){
            res.add(str);
            return;
        }
        char ch=digits.charAt(index);
        String letter=letters[ch-'0'];
        for(int i=0;i<letter.length();i++)
            combination(digits,index+1,str+String.valueOf(letter.charAt(i)));
    }
}