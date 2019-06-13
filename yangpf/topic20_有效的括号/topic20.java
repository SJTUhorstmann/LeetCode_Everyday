class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='[')   stack.push(']');
            else if(ch=='{')   stack.push('}');
            else if(ch=='(')   stack.push(')');
            else{
                if(stack.isEmpty()) return false;
                if(stack.pop()!=ch) return false;
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}