import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        
        stack.push('X');
        stack.push('Y');
        stack.push('Z');
        
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); 
        }
    }
}
