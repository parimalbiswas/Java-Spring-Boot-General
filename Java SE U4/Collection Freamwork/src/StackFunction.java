import java.util.Stack;

public class StackFunction {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        stk.push("Lion");
        stk.push("Tiger");
        stk.push("cow");

        stk.push("Cat");

        System.out.println("Stack it->"+stk);

        System.out.println(stk.peek());

        System.out.println(stk.pop());
        System.out.println("Stack it->"+stk);
        System.out.println(stk.peek());
        System.out.println("Stack it->"+stk);
    }
}
