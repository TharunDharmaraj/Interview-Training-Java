
public class implement {
    public static void main(String[] args) {
        int n = 5;
        makeQueue queue = new makeQueue(n);
        queue.enqueue(1);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

    }
}

class makeQueue {
    int size, top = -1, rear = -1;
    int[] queue;

    makeQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int num) {
        if (!isFull()) {
            if (top == -1) {
                top = 0;
            }
            rear++;
            queue[rear] = num;
            System.out.println(num + " Inserted!");
        } else {
            System.out.println("Queue Full");
        }
    }

    void dequeue() {
        if (!isEmpty()) {
            System.out.println(queue[top] + " Dequeued");
            if (top >= rear) {
                top = -1;
                rear = -1;
            } else {
                top++;
            }
        } else {
            System.out.println("Queue empty!!!");
        }
    }

    boolean isFull() {
        if (rear == size - 1 && top == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void printQueue() {
        System.out.println();
        for (int i = top; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
    }
}
