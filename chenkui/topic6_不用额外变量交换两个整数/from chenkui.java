public class Solution {

    public void reverse(int a,int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
    
}