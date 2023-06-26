package ALLDS.LinkedList;

class LinkedList {
    Node head;

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static LinkedList insertAtLastLL(LinkedList list, int data) {
        System.out.println("LinkedList after Insertion at last:");
        Node newNode = new Node(data);
        newNode.next = null;
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node nn = list.head;
            while (nn.next != null) {
                nn = nn.next;
            }
            nn.next = newNode;
        }
        return list;
    }

    public static LinkedList insertAtFirstLL(LinkedList ll, int data) {
        System.out.println("LinkedList after Insertion at first:");
        Node newNode = new Node(data);
        if (ll.head == null) {
            ll.head = newNode;
        } else {
            Node temp = ll.head;
            ll.head = newNode;
            ll.head.next = temp;
        }
        return ll;
    }

    public static LinkedList deleteLinkedListByData(LinkedList ll, int data) {
        System.out.println("LinkedList after Deletion by data:");
        Node newNode = ll.head, prev = null;
        if (newNode.data == data && newNode != null) {
            ll.head = newNode.next;
        } else {
            while (newNode != null && newNode.data != data) {
                prev = newNode;
                newNode = newNode.next;
            }
            if (newNode != null) {
                prev.next = newNode.next;
            } else {
                System.out.println(data + " Not found in Linked list");
            }
        }
        return ll;
    }

    public static LinkedList deleteLLAtPos(LinkedList ll, int pos) {
        System.out.println("LinkedList after Deletion by pos:");
        Node newNode = ll.head, prev = null;
        if (pos == 0 && newNode != null) {
            ll.head = newNode.next;
        } else {
            int i = 0;
            while (newNode != null) {
                if (i == pos) {
                    prev.next = newNode.next;
                } else {
                    prev = newNode;
                    newNode = newNode.next;
                    i++;
                }
            }
            if (newNode == null) {
                System.out.println(i + " Position Element Not found");
            }
        }
        return ll;
    }

    public static void printList(LinkedList list) {
        System.out.print("Linked list -> ");
        Node newNode = list.head;
        while (newNode != null) {
            System.out.print(newNode.data + " ");
            newNode = newNode.next;
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static LinkedList reverseLL(LinkedList ll) {
        System.out.println("Reversed Liked List is :");
        Node newNode = ll.head, nextNode = null, prev = null;
        if (newNode == null) {
            return ll;
        }
        while (newNode != null) {
            nextNode = newNode.next;
            newNode.next = prev;
            prev = newNode;
            newNode = nextNode;
        }
        ll.head = prev;
        return ll;
    }

    public static void getMiddle(LinkedList ll) {
        Node fast = ll.head, slow = ll.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Middle element is " + slow.data);
    }

    void detectLoop() {
        Node slow_p = head, fast_p = head;
        int flag = 0;
        while (slow_p != null && fast_p != null
                && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                flag = 1;
                break;

            }
        }
        if (flag == 1) {
            System.out.println("Loop Found");
            removeLoop(slow_p, fast_p);
        } else
            System.out.println("No Loop");
    }

    static void removeLoop(Node loop, Node head) {
        Node ptr1 = loop;
        Node ptr2 = loop;

        // Count the number of nodes in loop
        int k = 1, i;
        Node prevNode = ptr1;
        while (ptr1.next != ptr2) {
            // keeping track beforeing moving next
            prevNode = ptr1;
            ptr1 = ptr1.next;
            k++;
        }
        prevNode.next = null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll = insertAtLastLL(ll, 0);
        ll = insertAtLastLL(ll, 1);
        ll = insertAtLastLL(ll, 2);
        ll = insertAtLastLL(ll, 3);
        ll = insertAtLastLL(ll, 4);
        ll = insertAtLastLL(ll, 5);
        ll = insertAtLastLL(ll, 6);
        printList(ll);
        ll = insertAtFirstLL(ll, 1);
        ll = insertAtFirstLL(ll, 2);
        printList(ll);
        ll = deleteLinkedListByData(ll, 10);
        printList(ll);
        ll = deleteLLAtPos(ll, -1);
        printList(ll);
        ll = reverseLL(ll);
        printList(ll);
        getMiddle(ll);
    }
}