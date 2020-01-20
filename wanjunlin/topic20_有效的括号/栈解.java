class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            char c = chars[i];
            if(c=='['||c=='{'||c=='('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char stackpop = stack.pop();
                boolean b1 = stackpop=='['&&c!=']';
                boolean b2 = stackpop=='('&&c!=')';
                boolean b3 = stackpop=='{'&&c!='}';
                if(b1||b2||b3){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}