class Solution {
    public String addBinary(String a, String b) {
        if(a.length()==0) 
            return b;
        if(b.length()==0)
            return a;
        int tem=0;
        int lena=a.length()-1;
        int lenb=b.length()-1;
        StringBuilder sb=new StringBuilder();
        
        while(tem>0 || lena>=0 || lenb>=0){
            if(lena>=0){
                tem=tem+(a.charAt(lena)-'0');
                lena--;
            }
            
            if(lenb>=0){
                tem=tem+(b.charAt(lenb)-'0');
                lenb--;
            }
            sb.append(tem%2);
            tem=tem/2;
        }
        return sb.reverse().toString();      
    }
}