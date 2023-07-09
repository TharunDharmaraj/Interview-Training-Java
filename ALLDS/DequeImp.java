package ALLDS;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImp {
  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.addFirst(1);
    deque.addLast(2);
    deque.addFirst(3);
    deque.addFirst(4);    
    deque.add(40);
    deque.remove();
    System.out.println(deque);
    int first = deque.removeFirst();
    int last = deque.removeLast();
    System.out.println("First: " + first + ", Last: " + last);
  }
}