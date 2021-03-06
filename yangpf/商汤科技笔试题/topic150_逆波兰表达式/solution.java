//栈
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int factor1=0;
        int factor2=0;
        int result=0;
        for(String s:tokens){
            if(s.equals("*")||s.equals("/")||s.equals("+")||s.equals("-")){
                factor2=stack.pop();
                factor1=stack.pop();
                if(s.equals("*"))   result=factor1*factor2;
                else if(s.equals("/"))  result=factor1/factor2;
                else if(s.equals("+"))  result=factor1+factor2;
                else    result=factor1-factor2;
                stack.push(result);
            }else{
                stack.push(Integer.valueOf(s));
            }
        }
        return Integer.valueOf(stack.pop());
    }
}

//改良写法
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            if(s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(s.equals("/")){
                int num=stack.pop();
                stack.push(stack.pop()/num);
            }else if(s.equals("-")){
                int num=stack.pop();
                stack.push(stack.pop()-num);
            }else if(s.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else{
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
}