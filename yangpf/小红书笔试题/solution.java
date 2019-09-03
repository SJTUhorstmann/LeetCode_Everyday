public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='<'){
                if(!stack.isEmpty()){
                    if(stack.peek()!='(' && stack.peek()!=')')  stack.pop();
                }
            }else if(ch==')'){
                while(stack.peek()!='('){
                    stack.pop();
                }
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse().toString());
    }
}