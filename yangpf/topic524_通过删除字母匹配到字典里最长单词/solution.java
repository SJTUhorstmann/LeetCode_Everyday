class Solution {
    public String findLongestWord(String s, List<String> d) {
        int max=0;
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<d.size();i++){
            String str=d.get(i);
            if(str.length()>=max&&contains(s,str)){
                if(str.length()>max){
                    max=str.length();
                    map.put(max,str);
                }else{
                    if(map.containsKey(max)){
                        if(compare(str,map.get(max))){
                            map.put(max,str);
                        }
                    }else{
                        map.put(max,str);
                    }
                }
            }
        }
        if(max==0)  return "";
        return map.get(max);
    }
    //比较s1和s2的字典序，true表示s1字典序小
    public boolean compare(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        for(int i=0;i<Math.min(m,n);i++){
            if(s1.charAt(i)>s2.charAt(i)){
                return false;
            }else if(s1.charAt(i)<s2.charAt(i)){
                return true;
            }else{
                
            }
        }
        if(n>m) return false;
        return true;
    }
    public boolean contains(String s1,String s2){
        if(s1.length()<s2.length()) return false;
        int i=0,j=0;
        while(j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;j++;
            }else{
                i++;
            }
            if(i>=s1.length()&&j<s2.length()){
                return false;
            }
        }
        return true;
    }
}