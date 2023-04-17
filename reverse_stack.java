import java.util.Stack;

public class reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        System.out.println("**************");
        Reverse(stack);
        System.out.println(stack);

    }
    public static void Reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int x = stack.pop();
        Reverse(stack);
        // stack.push(x); it is not working now will push value in the bottom of the stack
        Insert_Down(stack,x);
    }
    public static void Insert_Down(Stack<Integer> stack, int x) {
        if(stack.isEmpty()){
            stack.push(x);
            return;
        }
        int y  = stack.pop();
        Insert_Down(stack, x);
        stack.push(y);
    }
}
