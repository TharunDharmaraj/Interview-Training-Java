package ALLDS.Stack;

import java.util.Stack;

public class qusing1stack {
    private Stack<Integer> stack;

    public qusing1stack() {
        stack = new Stack<>();
    }

    public void enqueue(int data) {
        stack.push(data);
    }

    public int dequeue() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (stack.size() == 1) {
            return stack.pop();
        }

        int item = stack.pop();
        int result = dequeue();
        stack.push(item);

        return result;
    }

    public static void main(String[] args) {
        qusing1stack queue = new qusing1stack();

        // Enqueue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        // Print the elements in the queue
        System.out.println("Queue: " + queue.stack);

        // Dequeue
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        // Print the remaining elements in the queue
        System.out.println("Queue: " + queue.stack);
    }
}
