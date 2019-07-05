class Solution {
    public boolean isPerfectSquare(int num) {
    
        int tem=(int)(Math.sqrt(num));
        
        return num==tem*tem;
        
    }
}