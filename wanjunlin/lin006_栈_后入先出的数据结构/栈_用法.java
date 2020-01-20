//大多数流行的语言都提供了内置的栈库，因此你不必重新发明轮子。
//除了初始化，我们还需要知道如何使用两个最重要的操作：入栈和退栈。
//除此之外，你应该能够从栈中获得顶部元素。
//当你想首先处理最后一个元素时，栈将是最合适的数据结构。
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        // 1. Initialize a stack.
        Stack<Integer> s = new Stack<>();
        // 2. Push new element.
        s.push(5);
        s.push(13);
        s.push(8);
        s.push(6);
        // 3. Check if stack is empty.
        if (s.empty() == true) {
            System.out.println("Stack is empty!");
            return;
        }
        // 4. Pop an element.
        s.pop();
        // 5. Get the top element.
        System.out.println("The top element is: " + s.peek());
        // 6. Get the size of the stack.
        System.out.println("The size is: " + s.size());
    }
}