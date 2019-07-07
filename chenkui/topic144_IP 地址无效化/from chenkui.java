class Solution {
    public String defangIPaddr(String address) {
        if(address==null )
            return "";
        String sb="";
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)!='.'){
                sb=sb+address.charAt(i);
            }
            else{
                sb=sb+"[.]";
            }
        }
       return sb; 
    }