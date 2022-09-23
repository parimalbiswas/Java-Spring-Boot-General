import java.util.Stack;

public class _4Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        stack.push(5);
        stack.push(8);
        stack.push(4);
        stack.push(9);
        stack.push(5);
        stack.peek();
        //stack.clear();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        //stack.clear();
        System.out.println(stack);

        if(stack.size()>0)
        {
            //Perform oparation
        }

    }
}
