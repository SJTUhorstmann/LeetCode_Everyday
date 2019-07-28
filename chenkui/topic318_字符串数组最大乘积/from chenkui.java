class Solution {
    public int maxProduct(String[] words) {
        int max=0;
        for(int i=0;i<words.length-1;i++){
            String st=words[i];
            for(int j=0;j<words.length;j++){
                String st1=words[j];
                if(st.length()*st1.length()<=max){
                    continue;
                }
                else{
                    boolean judge=true;
                    for(int k=0;k<st1.length();k++){
                        if(st.contains(""+st1.charAt(k))){
                            judge=false;
                            break;
                        }
                    }
                    if(judge){
                        max=st.length()*st1.length();
                    }
                    
                }
            }
        }
        return max;
    }
}