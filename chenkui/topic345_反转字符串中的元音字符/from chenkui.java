class Solution {
    public String reverseVowels(String s) {
    if(s.length()<2) return s;
    StringBuilder sb=new StringBuilder();
    char[] ch=s.toCharArray();
    int be=0;
    int en=s.length()-1;
    char tem;
    while(be<en){
      if(ch[be]=='a'|| ch[be]=='e'|| ch[be]=='i'|| ch[be]=='o'|| ch[be]=='u'|| ch[be]=='A'|| ch[be]=='E'|| ch[be]=='I'|| ch[be]=='O'|| ch[be]=='U'){
        if(ch[en]=='a'|| ch[en]=='e'|| ch[en]=='i'|| ch[en]=='o'|| ch[en]=='u'|| ch[en]=='A'|| ch[en]=='E'|| ch[en]=='I'|| ch[en]=='O'|| ch[en]=='U'){
          tem=ch[be];
          ch[be]=ch[en];
          ch[en]=tem;
          be++;
          en--;
        }
        else{
          en--;
        }
      }
      else{
        be++;
      }
    }
      for(int i=0;i<ch.length;i++){
        sb=sb.append(ch[i]);
      }
      return sb.toString(); 
    }
}