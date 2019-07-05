class Solution {
    public String convertToBase7(int num) {
        if(num==0) 
            return "0";
        
        boolean judge=false;

        if(num<0){
            judge=true;
            num=-num;
        }
        StringBuilder sb=new StringBuilder();
        while(num!=0){
            int tem=num%7;
            sb.append(tem);
            num=num/7;
        }
        sb.append("");
        if(judge){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}