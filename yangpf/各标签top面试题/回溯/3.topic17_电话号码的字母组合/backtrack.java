class Solution {
    private List<String> res=new ArrayList<>();
    private String[] letters=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        StringBuilder sb=new StringBuilder();
        if(digits.length()==0)  return res;
        help(digits,sb,0);
        return res;
    }
    public void help(String digits,StringBuilder sb,int index){
        if(sb.length()==digits.length()){
            res.add(sb.toString());
            return;
        }
        char ch=digits.charAt(index);
        String letter=letters[ch-'0'];
        for(int i=0;i<letter.length();i++){
            help(digits,sb.append(letter.charAt(i)),index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}