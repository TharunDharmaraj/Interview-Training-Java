// Link: https://practice.geeksforgeeks.org/problems/delete-middle-of-linked-list/1
package ALLDS.LinkedList;

public class deleteMid {
    Node deleteMid(Node head) {
        if(head == null || head.next == null){
            return null;
        }
        Node fast = head;
        Node slow = head;
        Node prev = null; 
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}
