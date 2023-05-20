package ALLDS.Stack;

public class implement {
    public static void main(String[] args) {
        makeStack stack = new makeStack(5);
        stack.push(2);
        stack.push(5);
        System.out.println("POP" + stack.pop());
        System.out.println("PEEK" + stack.peek());
        System.out.println("PEEK" + stack.peek());
        stack.printStack();
    }
}
