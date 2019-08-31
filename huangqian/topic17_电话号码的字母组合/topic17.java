class Solution {
    List<String> resList = new ArrayList<>();
    String[] letters=new String[]{" ","!@#","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return resList;
        getLetter(0,digits,"");
        return resList;
    }
    public void getLetter(int index,String digits,String preLetter){
        if(index==digits.length()){
            resList.add(preLetter);
            return;
        }
        char ch = digits.charAt(index);
        String letter = letters[ch-'0'];
        for(int i=0;i<letter.length();i++){
            getLetter(index+1,digits,preLetter+String.valueOf(letter.charAt(i)));
        }
    }
}

