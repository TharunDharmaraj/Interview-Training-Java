package ALLDS.Stack;

class makeStack {
    private int capacity;
    private int top = -1;
    private int[] arr;

    makeStack(int size) {
        capacity = size;
        arr = new int[capacity];
    }

    public void push(int element) {
        if (!isFull()) {
            arr[++top] = element;
            System.out.println(element + " Pushed in top " + top);
        } else {
            System.out.println("OVERFLOW ERROR");
            System.exit(1);
        }
    }

    public void pop() {
        if (!isEmpty()) {
            System.out.println(arr[top--] + " Popped!");
        } else {
            System.out.println("UNDERFLOW ERROR");
            System.exit(1);
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
        if (top + 1 == capacity) {
            return true;
        }
        return false;
    }

    public void printStack() {
        System.out.println("\n\nStack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}