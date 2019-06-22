class Solution {
    public List<String> letterCombinations(String digits) {
      LinkedList<String> list=new LinkedList<String>();
      if(digits.length()==0) return list;
      list.add("");
      String[] st=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      for(int i=0;i<digits.length();i++){
        int tem=digits.charAt(i)-'0';
        int len=st[tem].length();
        while(list.peek().length()==i){
          String st1= list.remove();
          for(int j=0;j<len;j++){
            list.add(st1+st[tem].charAt(j));
          }
        }
      }
      return list;
    }
}