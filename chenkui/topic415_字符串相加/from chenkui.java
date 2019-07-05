class Solution {
    public String addStrings(String num1, String num2) {
        
        StringBuilder sb = new StringBuilder();
        int tem = 0;

        int len2 = num2.length() - 1;
        int len1 = num1.length() - 1; 
        
        while (tem >0  || len1 >= 0 || len2 >= 0) {
            
            int tem1 = len1 < 0 ? 0 : num1.charAt(len1--) - '0';
            int tem2 = len2 < 0 ? 0 : num2.charAt(len2--) - '0';
            
            sb .append((tem1 + tem2 + tem) % 10);
            tem = (tem1 + tem2 + tem) / 10;
    }
        
    return sb.reverse().toString();
}
}