package ALLDS.Stack;

public class makeStack {
    private int capacity;
    private int top = -1;
    private int[] arr = new int[capacity];

    makeStack(int size) {
        capacity = size;
    }

    public void push(int element) {
        if (!isFull()) {
            arr[++top] = element;
        } else {
            System.out.println("OVERFLOW ERROR");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return arr[top--];
        } else {
            System.out.println("UNDERFLOW ERROR");
            return 1;
        }
    }

    public int peek() {
        if (!(top == -1)) {
            return arr[top];
        } else {
            System.out.println("UNDERFLOW ERROR");
            return 1;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (top == capacity) {
            return true;
        }
        return false;
    }

    public void printStack() {
        System.out.println("\n");
        for (int i = 0; i < top; i++) {
            System.out.print(arr[top + 1] + " ");
        }
    }
}